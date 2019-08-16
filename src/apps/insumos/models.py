from apps.app_base.models import Base
from django.db import models

class Insumo(Base):

    codigo = models.CharField(max_length=10, blank=True, null=True, verbose_name="Código")
    descripcion = models.CharField(max_length=100, blank=True, null=True, verbose_name="Descripción")
    cantidad_total_en_gramos = models.FloatField(blank=True, null=True, verbose_name="Cantidad Total en Gramos")
    costo_total_al_gramo = models.FloatField(blank=True, null=True, verbose_name="Costo Total al Gramos")
    stock_minimo = models.FloatField(blank=True, null=True, verbose_name="Stock Mínimo")

    app_name = 'Insumo'

    def __init__(self, *args, **kwargs):
        super(Insumo, self).__init__(*args, **kwargs)
        self.detail_view = 'insumos:detalle'
        self.edit_view = 'insumos:edicion'
        self.delete_view = 'insumos:eliminacion'
        self.create_view = 'insumos:creacion'

    def __str__(self):
        return str(self.id)
