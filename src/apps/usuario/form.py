from apps.usuario.models import Usuario
from django import forms
from crispy_forms.helper import FormHelper
from crispy_forms.layout import Fieldset,Layout,ButtonHolder,Submit,HTML
from crispy_forms.bootstrap import *

class UsuarioForm(forms.ModelForm):
    def __init__(self,*args,**kwargs):
        super(UsuarioForm, self).__init__(*args, **kwargs)
        self.helper = FormHelper()
        self.helper.form_action = '#'
        self.helper.layout = Layout(
            Fieldset(
                'Datos Basicos',
                'username',
                'first_name',
                'last_name',
                'email',
                'password',
                'is_active'
            ),
            ButtonHolder(
                Submit('submit', 'Guardar', css_class='bg-sidebar border-dark mr-3'),
                HTML('<a class="btn btn-danger" href={% url \'usuario:index\' %}>Cancelar</a></button>')
            )
        )
        self.fields['password'] = forms.CharField(widget=forms.PasswordInput)
    class Meta:
        model = Usuario
        fields = ['username','first_name','last_name','password','email']