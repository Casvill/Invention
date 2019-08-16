from django.urls import path,include
from apps.app_base.views import LoginView,IndexView,LogoutView
    
app_name = 'app_base'

urlpatterns = [
    path('', IndexView.as_view(), name='index'),
    path('login/', LoginView.as_view(), name='login'),
    path('logout', LogoutView.as_view(), name='logout'),
]