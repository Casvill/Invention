from django.views.generic import CreateView, UpdateView, DeleteView, DetailView
from apps.productos.models import Producto
from apps.productos.form import ProductoForm
from django.urls import reverse_lazy
from django.http import HttpResponseRedirect
from django.forms.models import model_to_dict
from apps.app_base.views import ListBase, CreateViewBase, UpdateViewBase, DeleteBase, DetailBase

class ProductoIndexView(ListBase):
    model = Producto

    field_values = ['owner']

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs)
        return context

class ProductoCreacionView(CreateViewBase):
    model = Producto
    form_class = ProductoForm
    success_url = reverse_lazy('productos:index')


class ProductoEdicionView(UpdateViewBase):
    model = Producto
    form_class = ProductoForm
    success_url = reverse_lazy('productos:index')


class ProductoEliminacionView(DeleteBase):
    model = Producto
    success_url = reverse_lazy('productos:index')

class ProductoDetalleView(DetailBase):
    model = Producto
