from django.urls import path,include
from apps.productos.views import ProductoCreacionView, ProductoEdicionView, ProductoIndexView, ProductoEliminacionView, ProductoDetalleView

app_name = 'productos'

urlpatterns = [
    path('',ProductoIndexView.as_view(),name='index'),
    path('creacion',ProductoCreacionView.as_view(),name='creacion'),
    path('edicion/<int:pk>',ProductoEdicionView.as_view(),name='edicion'),
    path('detalle/<int:pk>',ProductoDetalleView.as_view(),name='detalle'),
    path('eliminacion/<int:pk>',ProductoEliminacionView.as_view(),name='eliminacion')
]