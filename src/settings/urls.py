"""src URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/2.2/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.urls import path, include

urlpatterns = [
    path('', include('apps.app_base.urls')),
    path('usuario/', include('apps.usuario.urls')),
    path('producto/', include('apps.productos.urls')),
    path('insumo/', include('apps.insumos.urls')),
    path('cliente/', include('apps.clientes.urls')),
    path('proveedor/', include('apps.proveedores.urls')),
]