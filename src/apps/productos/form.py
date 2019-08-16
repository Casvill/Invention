from apps.productos.models import Producto
from django import forms
from crispy_forms.helper import FormHelper
from crispy_forms.layout import Fieldset,Layout,ButtonHolder,Submit,HTML
from crispy_forms.bootstrap import *

class ProductoForm(forms.ModelForm):
    def __init__(self,*args,**kwargs):
        super(ProductoForm, self).__init__(*args, **kwargs)
        self.helper = FormHelper()
        self.helper.form_action = '#'
        self.helper.layout = Layout(
            Fieldset(
                'Datos Basicos',
                'codigo',
                'descripcion',
                'valor_bruto',
                'descuento',
                'subtotal',
                'iva',
                'valor_neto',
                'costo',
                'owner'
            ),
            ButtonHolder(
                Submit('submit', 'Guardar', css_class='bg-sidebar border-dark mr-3'),
                HTML('<a class="btn btn-danger" href={% url \'productos:index\' %}>Cancelar</a></button>')
            )
        )
    class Meta:
        model = Producto
        fields = ['owner', 'codigo', 'descripcion', 'valor_bruto', 'descuento', 'subtotal', 'iva', 'valor_neto', 'costo']