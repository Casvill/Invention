from django.views.generic import CreateView, UpdateView, DeleteView, DetailView
from apps.proveedores.models import Proveedor
from apps.proveedores.form import ProveedorForm
from django.urls import reverse_lazy
from django.http import HttpResponseRedirect
from django.forms.models import model_to_dict
from apps.app_base.views import ListBase, CreateViewBase, UpdateViewBase, DeleteBase, DetailBase

class ProveedorIndexView(ListBase):
    model = Proveedor

    field_values = ['owner']

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs)
        return context

class ProveedorCreacionView(CreateViewBase):
    model = Proveedor
    form_class = ProveedorForm
    success_url = reverse_lazy('proveedores:index')


class ProveedorEdicionView(UpdateViewBase):
    model = Proveedor
    form_class = ProveedorForm
    success_url = reverse_lazy('proveedores:index')


class ProveedorEliminacionView(DeleteBase):
    model = Proveedor
    success_url = reverse_lazy('proveedores:index')

class ProveedorDetalleView(DetailBase):
    model = Proveedor
