from apps.insumos.models import Insumo
from django import forms
from crispy_forms.helper import FormHelper
from crispy_forms.layout import Fieldset,Layout,ButtonHolder,Submit,HTML
from crispy_forms.bootstrap import *

class InsumoForm(forms.ModelForm):
    def __init__(self,*args,**kwargs):
        super(InsumoForm, self).__init__(*args, **kwargs)
        self.helper = FormHelper()
        self.helper.form_action = '#'
        self.helper.layout = Layout(
            Fieldset(
                'Datos Basicos',
                'codigo',
                'descripcion',
                'cantidad_total_en_gramos',
                'costo_total_al_gramo',
                'stock_minimo',
                'owner'
            ),
            ButtonHolder(
                Submit('submit', 'Guardar', css_class='bg-sidebar border-dark mr-3'),
                HTML('<a class="btn btn-danger" href={% url \'insumos:index\' %}>Cancelar</a></button>')
            )
        )
    class Meta:
        model = Insumo
        fields = ['owner', 'codigo', 'descripcion', 'cantidad_total_en_gramos', 'costo_total_al_gramo', 'stock_minimo']
