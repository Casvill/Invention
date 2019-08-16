from apps.clientes.models import Cliente
from django import forms
from crispy_forms.helper import FormHelper
from crispy_forms.layout import Fieldset,Layout,ButtonHolder,Submit,HTML
from crispy_forms.bootstrap import *

class ClienteForm(forms.ModelForm):
    def __init__(self,*args,**kwargs):
        super(ClienteForm, self).__init__(*args, **kwargs)
        self.helper = FormHelper()
        self.helper.form_action = '#'
        self.helper.layout = Layout(
            Fieldset(
                'Datos Basicos',
                'nombres',
                'apellidos',
                'tipo_documento',
                'identificacion',
                'fecha_nacimiento',
                'owner'
            ),
            ButtonHolder(
                Submit('submit', 'Guardar', css_class='bg-sidebar border-dark mr-3'),
                HTML('<a class="btn btn-danger" href={% url \'clientes:index\' %}>Cancelar</a></button>')
            )
        )
    class Meta:
        model = Cliente
        fields = ['owner', 'nombres', 'apellidos', 'tipo_documento', 'identificacion', 'fecha_nacimiento']