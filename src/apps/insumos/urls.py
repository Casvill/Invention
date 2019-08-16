from django.urls import path,include
from apps.insumos.views import InsumoCreacionView, InsumoEdicionView, InsumoIndexView, InsumoEliminacionView, InsumoDetalleView

app_name = 'insumos'

urlpatterns = [
    path('',InsumoIndexView.as_view(),name='index'),
    path('creacion',InsumoCreacionView.as_view(),name='creacion'),
    path('edicion/<int:pk>',InsumoEdicionView.as_view(),name='edicion'),
    path('detalle/<int:pk>',InsumoDetalleView.as_view(),name='detalle'),
    path('eliminacion/<int:pk>',InsumoEliminacionView.as_view(),name='eliminacion')
]