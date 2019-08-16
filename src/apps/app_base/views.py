from django.shortcuts import render,redirect, render_to_response
from django.views.generic import View, UpdateView, DetailView, ListView, DeleteView, CreateView
from django.http.response import HttpResponse
from django.utils.decorators import method_decorator
from django.contrib.auth.decorators import permission_required, login_required
from django.contrib.auth import authenticate,login,logout
from apps.usuario.models import Usuario
from django.urls import reverse_lazy
from django.http import HttpResponseRedirect

class LoginView(View):
    def get(self,request, *args, **kwargs):
        if request.user.is_authenticated:
            return redirect('app_base:index')
        return render(request,'app_base/login.html',{})
    def post(self,request, *args, **kwargs):
        username = request.POST.get('username')
        password = request.POST.get('password')
        usuario_db = Usuario.objects.filter(username=username).first()
        if usuario_db:
            usuario = authenticate(username=username,password=password)
            if usuario and usuario.is_active:
                login(request,usuario)
                return redirect('app_base:index')
        return redirect('app_base:login')

class LogoutView(View):
    def get(self,request,*args,**kwargs):
        logout(request)
        return redirect('app_base:login')

class IndexView(View):
    def get(self,request,*args,**kwargs):
        return render(request,'app_base/index.html',{})
    
    @method_decorator(login_required)
    def dispatch(self, *args, **kwargs):
        return super().dispatch(*args, **kwargs)

class ListBase(ListView):

    field_values = []

    @method_decorator(login_required)
    def dispatch(self, *args, **kwargs):
        return super().dispatch(*args, **kwargs)

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs)
        field_values = kwargs.get('field_values', [])
        fields = []
        for field in self.field_values[:]:
            row = {}
            row['header'] = self.model._meta.get_field(field).verbose_name
            row['name'] = field
            fields.append(row)
        context['fields'] = fields
        context['class'] = self.model.__name__
        context['app'] = self.model.app_name
        context['creation_url'] = self.model._meta.app_label + ":creacion"
        return context

class CreateViewBase(CreateView):

    success_url = reverse_lazy('app_base:index')

    @method_decorator(login_required)
    def dispatch(self, *args, **kwargs):
        return super().dispatch(*args, **kwargs)
    
    def form_valid(self, form):
        base = form.save(commit=False)
        base.created_by = self.request.user
        base.updated_by = self.request.user
        base.save()
        return HttpResponseRedirect(self.success_url)


class UpdateViewBase(UpdateView):
    
    success_url = reverse_lazy('app_base:index')

    @method_decorator(login_required)
    def dispatch(self, *args, **kwargs):
        return super().dispatch(*args, **kwargs)
    
    def form_valid(self, form):
        base = form.save(commit=False)
        base.updated_by = self.request.user
        base.save()
        return HttpResponseRedirect(self.success_url)


class DetailBase(DetailView):

    field_values = []

    @method_decorator(login_required)
    def dispatch(self, *args, **kwargs):
        return super().dispatch(*args, **kwargs)

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs)
        field_values = kwargs.get('field_values', [])
        fields = []
        for field in self.field_values[:]:
            row = {}
            row['header'] = self.model._meta.get_field(field).verbose_name
            row['name'] = field
            fields.append(row)
        context['fields'] = fields
        context['class'] = self.model.__name__
        context['app'] = self.model.app_name
        context['index_url'] = self.model._meta.app_label + ":index"

        return context

class DeleteBase(DeleteView):

    @method_decorator(login_required)
    def dispatch(self, *args, **kwargs):
        return super().dispatch(*args, **kwargs)

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs)
        context['class'] = self.model.__name__
        context['app'] = self.model.app_name
        context['index_url'] = self.model._meta.app_label + ":index"

        return context
