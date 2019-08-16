from apps.app_base.models import Base
from django.db import models

class Producto(Base):

    app_name = 'Productos'

    codigo = models.CharField(max_length=10, blank=True, null=True, verbose_name="Código")
    descripcion = models.CharField(max_length=100, blank=True, null=True, verbose_name="Descripción")
    valor_bruto = models.FloatField(blank=True, null=True, verbose_name="Valor Bruto")
    descuento = models.FloatField(blank=True, null=True, verbose_name="Descuento")
    subtotal = models.FloatField(blank=True, null=True, verbose_name="Subtotal")
    iva = models.FloatField(blank=True, null=True, verbose_name="Iva")
    valor_neto = models.FloatField(blank=True, null=True, verbose_name="Valor Neto")
    costo = models.FloatField(blank=True, null=True, verbose_name="Costo")


    def __init__(self, *args, **kwargs):
        super(Producto, self).__init__(*args, **kwargs)
        self.detail_view = 'productos:detalle'
        self.edit_view = 'productos:edicion'
        self.delete_view = 'productos:eliminacion'
        self.create_view = 'productos:creacion'

    def __str__(self):
        return str(self.id)
