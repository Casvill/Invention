from django.urls import path,include
from apps.proveedores.views import ProveedorCreacionView, ProveedorEdicionView, ProveedorIndexView, ProveedorEliminacionView, ProveedorDetalleView

app_name = 'proveedores'

urlpatterns = [
    path('',ProveedorIndexView.as_view(),name='index'),
    path('creacion',ProveedorCreacionView.as_view(),name='creacion'),
    path('edicion/<int:pk>',ProveedorEdicionView.as_view(),name='edicion'),
    path('detalle/<int:pk>',ProveedorDetalleView.as_view(),name='detalle'),
    path('eliminacion/<int:pk>',ProveedorEliminacionView.as_view(),name='eliminacion')
]