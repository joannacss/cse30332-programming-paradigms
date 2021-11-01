from django.urls import include, path
from rest_framework import routers
from parking_api import views

router = routers.DefaultRouter()
router.register(r'owners', views.OwnerViewSet)
router.register(r'vehicles', views.VehicleViewSet)

urlpatterns = [
    path('', include(router.urls)),
    path('api/', include('rest_framework.urls', namespace='rest_framework'))
]
