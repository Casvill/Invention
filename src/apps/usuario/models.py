from django.db import models
from django.contrib.auth.models import AbstractUser
from django.urls import reverse_lazy

class Usuario(AbstractUser):

    app_name = 'Usuarios'
    
    detail_view = 'usuario:detalle'
    edit_view = 'usuario:edicion'
    delete_view = 'usuario:eliminacion'
    create_view = 'usuario:creacion'

    @property
    def get_create_url(self):
        return reverse_lazy(self.create_view)
    @property
    def get_detail_url(self):
        return reverse_lazy(self.detail_view,args=[str(self.id)])
    @property
    def get_edit_url(self):
        return reverse_lazy(self.edit_view,args=[str(self.id)])
    @property
    def get_delete_url(self):
        return reverse_lazy(self.delete_view,args=[str(self.id)])

Usuario._meta.get_field('username').verbose_name = 'Usuario'
Usuario._meta.get_field('first_name').verbose_name = 'Nombre'
Usuario._meta.get_field('last_name').verbose_name = 'Apellidos'
Usuario._meta.get_field('date_joined').verbose_name = 'Fecha Creación'