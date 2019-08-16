from apps.app_base.models import Base
from django.db import models

class Proveedor(Base):

    TIPO_DOCUMENTO_LIST = (
        ('CC', 'CC'),
        ('TI', 'TI'),
        ('PASAPORTE', 'PASAPORTE'),
    )

    nombre = models.CharField(max_length=20, blank=True, null=True, verbose_name="Nombres")
    tipo_documento = models.CharField(max_length=20, blank=True, null=True, choices=TIPO_DOCUMENTO_LIST, verbose_name="Tipo de Documento")
    identificacion = models.CharField(max_length=20, blank=True, null=True, verbose_name="Identificacion")
    direccion = models.CharField(max_length=20, blank=True, null=True, verbose_name="Dirección")
    telefono = models.CharField(max_length=20, blank=True, null=True, verbose_name="Teléfono")

    app_name = 'Proveedor'

    def __init__(self, *args, **kwargs):
        super(Proveedor, self).__init__(*args, **kwargs)
        self.detail_view = 'proveedores:detalle'
        self.edit_view = 'proveedores:edicion'
        self.delete_view = 'proveedores:eliminacion'
        self.create_view = 'proveedores:creacion'

    def __str__(self):
        return str(self.id)
