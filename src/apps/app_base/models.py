from django.db import models
from apps.usuario.models import Usuario
from django.urls import reverse_lazy

class BaseManager(models.Manager):
    def get_queryset(self):
        return super(BaseManager, self).get_queryset().filter(is_active=True)

class Base(models.Model):

    def __init__(self, *args, **kwargs):
        super(Base, self).__init__(*args, **kwargs)
        self.detail_view = None
        self.edit_view = None
        self.delete_view = None


    is_active = models.BooleanField(default=True, verbose_name="Activo")
    owner = models.ForeignKey(Usuario, null=True, on_delete=models.CASCADE, related_name="%(class)s_owner", verbose_name="Propietario")
    created_by = models.ForeignKey(Usuario, null=True, blank=True, on_delete=models.CASCADE, related_name="%(class)s_created_by", verbose_name="Propietario")
    created_at = models.DateTimeField(auto_now_add=True, verbose_name="Fecha de creación")
    updated_by = models.ForeignKey(Usuario, null=True, on_delete=models.CASCADE, related_name="%(class)s_updated_by", verbose_name="Propietario")
    updated_at = models.DateTimeField(auto_now=True, verbose_name="Fecha de Actualización")


    @property
    def get_detail_url(self):
        if self.detail_view:
            return reverse_lazy(self.detail_view,args=[str(self.id)])
        else:
            return '#'
    @property
    def get_edit_url(self):
        if self.edit_view:
            return reverse_lazy(self.edit_view,args=[str(self.id)])
        else:
            return '#'
    @property
    def get_delete_url(self):
        if self.delete_view:
            return reverse_lazy(self.delete_view,args=[str(self.id)])
        else:
            return '#'
    
    def get_field(self, field):
        if hasattr(self, field):
            return getattr(self, field) 
        return ''
    
    def delete(self, *args, **kwargs):
        self.is_active = 0
        self.save()

    objects = BaseManager()

    class Meta:
        abstract = True
