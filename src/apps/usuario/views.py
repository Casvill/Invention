from django.views.generic import CreateView, UpdateView, ListView, DeleteView, DetailView
from apps.usuario.models import Usuario
from apps.usuario.form import UsuarioForm
from django.urls import reverse_lazy
from apps.app_base.views import ListBase, DetailBase, DeleteBase
from django.contrib.auth import authenticate, login
from django.shortcuts import redirect
from django.contrib.auth.hashers import make_password

class UsuarioIndexView(ListBase):
    model = Usuario
    field_values = ['first_name']

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs)
        context['str_object'] = "Usuario"
        return context

class UsuarioCreacionView(CreateView):
    model = Usuario
    form_class = UsuarioForm
    success_url = reverse_lazy('usuario:index')

    def post(self, request, *args, **kwargs):
        form = self.form_class(request.POST)
        if form.is_valid():
            usuario = form.save()
            if usuario.password:
                usuario.password = make_password(usuario.password)
            usuario.save()
            return redirect(self.success_url)
        return redirect('usuario:creacion')

class UsuarioEdicionView(UpdateView):
    model = Usuario
    form_class = UsuarioForm
    success_url = reverse_lazy('usuario:index')

    def post(self, request, *args, **kwargs):
        instance = self.model.objects.get(id=kwargs.get('pk'))
        form = self.form_class(request.POST, instance=instance)
        if form.is_valid():
            usuario = form.save()
            if usuario.password:
                usuario.password = make_password(usuario.password)
            usuario.save()
            return redirect(self.success_url)
        return redirect('usuario:edicion', *args, **kwargs)

class UsuarioEliminacionView(DeleteBase):
    model = Usuario
    success_url = reverse_lazy('usuario:index')

class UsuarioDetalleView(DetailBase):
    model = Usuario
    field_values = ['username', 'first_name', 'last_name', 'date_joined']

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs)
        return context
