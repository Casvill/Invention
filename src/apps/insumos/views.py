from django.views.generic import CreateView, UpdateView, DeleteView, DetailView
from apps.insumos.models import Insumo
from apps.insumos.form import InsumoForm
from django.urls import reverse_lazy
from django.http import HttpResponseRedirect
from django.forms.models import model_to_dict
from apps.app_base.views import ListBase, CreateViewBase, UpdateViewBase, DeleteBase, DetailBase

class InsumoIndexView(ListBase):
    model = Insumo

    field_values = ['owner']

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs)
        return context

class InsumoCreacionView(CreateViewBase):
    model = Insumo
    form_class = InsumoForm
    success_url = reverse_lazy('insumos:index')


class InsumoEdicionView(UpdateViewBase):
    model = Insumo
    form_class = InsumoForm
    success_url = reverse_lazy('insumos:index')


class InsumoEliminacionView(DeleteBase):
    model = Insumo
    success_url = reverse_lazy('insumos:index')

class InsumoDetalleView(DetailBase):
    model = Insumo
