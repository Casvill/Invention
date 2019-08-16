from django.urls import path,include
from apps.usuario.views import UsuarioCreacionView, UsuarioEdicionView, UsuarioIndexView, UsuarioEliminacionView, UsuarioDetalleView

app_name = 'usuario'

urlpatterns = [
    path('',UsuarioIndexView.as_view(),name='index'),
    path('creacion',UsuarioCreacionView.as_view(),name='creacion'),
    path('edicion/<int:pk>',UsuarioEdicionView.as_view(),name='edicion'),
    path('detalle/<int:pk>',UsuarioDetalleView.as_view(),name='detalle'),
    path('eliminacion/<int:pk>',UsuarioEliminacionView.as_view(),name='eliminacion')
]