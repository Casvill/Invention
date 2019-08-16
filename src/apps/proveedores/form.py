from apps.proveedores.models import Proveedor
from django import forms
from crispy_forms.helper import FormHelper
from crispy_forms.layout import Fieldset,Layout,ButtonHolder,Submit,HTML
from crispy_forms.bootstrap import *

class ProveedorForm(forms.ModelForm):
    def __init__(self,*args,**kwargs):
        super(ProveedorForm, self).__init__(*args, **kwargs)
        self.helper = FormHelper()
        self.helper.form_action = '#'
        self.helper.layout = Layout(
            Fieldset(
                'Datos Basicos',
                'nombre',
                'tipo_documento',
                'identificacion',
                'direccion',
                'telefono',
                'owner'
            ),
            ButtonHolder(
                Submit('submit', 'Guardar', css_class='bg-sidebar border-dark mr-3'),
                HTML('<a class="btn btn-danger" href={% url \'proveedores:index\' %}>Cancelar</a></button>')
            )
        )
    class Meta:
        model = Proveedor
        fields = ['owner', 'nombre', 'tipo_documento', 'identificacion', 'direccion', 'telefono']