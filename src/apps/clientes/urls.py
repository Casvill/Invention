from django.urls import path,include
from apps.clientes.views import ClienteCreacionView, ClienteEdicionView, ClienteIndexView, ClienteEliminacionView, ClienteDetalleView

app_name = 'clientes'

urlpatterns = [
    path('',ClienteIndexView.as_view(),name='index'),
    path('creacion',ClienteCreacionView.as_view(),name='creacion'),
    path('edicion/<int:pk>',ClienteEdicionView.as_view(),name='edicion'),
    path('detalle/<int:pk>',ClienteDetalleView.as_view(),name='detalle'),
    path('eliminacion/<int:pk>',ClienteEliminacionView.as_view(),name='eliminacion')
]