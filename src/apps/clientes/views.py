from django.views.generic import CreateView, UpdateView, DeleteView, DetailView
from apps.clientes.models import Cliente
from apps.clientes.form import ClienteForm
from django.urls import reverse_lazy
from django.http import HttpResponseRedirect
from django.forms.models import model_to_dict
from apps.app_base.views import ListBase, CreateViewBase, UpdateViewBase, DeleteBase, DetailBase

class ClienteIndexView(ListBase):
    model = Cliente

    field_values = ['owner']

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs)
        return context

class ClienteCreacionView(CreateViewBase):
    model = Cliente
    form_class = ClienteForm
    success_url = reverse_lazy('clientes:index')


class ClienteEdicionView(UpdateViewBase):
    model = Cliente
    form_class = ClienteForm
    success_url = reverse_lazy('clientes:index')


class ClienteEliminacionView(DeleteBase):
    model = Cliente
    success_url = reverse_lazy('clientes:index')

class ClienteDetalleView(DetailBase):
    model = Cliente
    field_values = ['owner', 'nombres']