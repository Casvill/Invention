from apps.app_base.models import Base
from django.db import models

class Cliente(Base):

    TIPO_DOCUMENTO_LIST = (
        ('CC', 'CC'),
        ('TI', 'TI'),
        ('PASAPORTE', 'PASAPORTE'),
    )

    nombres = models.CharField(max_length=20, blank=True, null=True, verbose_name="Nombres")
    apellidos = models.CharField(max_length=20, blank=True, null=True, verbose_name="Apellidos")
    tipo_documento = models.CharField(max_length=20, blank=True, null=True, choices=TIPO_DOCUMENTO_LIST, verbose_name="Tipo de Documento")
    identificacion = models.CharField(max_length=20, blank=True, null=True, verbose_name="Identificacion")
    fecha_nacimiento = models.DateTimeField(blank=True, null=True, verbose_name="Fecha de Nacimiento")

    app_name = 'Cliente'

    def __init__(self, *args, **kwargs):
        super(Cliente, self).__init__(*args, **kwargs)
        self.detail_view = 'clientes:detalle'
        self.edit_view = 'clientes:edicion'
        self.delete_view = 'clientes:eliminacion'
        self.create_view = 'clientes:creacion'

    def __str__(self):
        return str(self.id)
