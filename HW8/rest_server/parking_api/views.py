from .models import Owner, Vehicle
from rest_framework import viewsets, permissions
from .serializers import OwnerSerializer, VehicleSerializer


class OwnerViewSet(viewsets.ModelViewSet):
    queryset = Owner.objects.all().order_by('id')
    serializer_class = OwnerSerializer
    permission_classes = [permissions.IsAuthenticated]

class VehicleViewSet(viewsets.ModelViewSet):
    queryset = Vehicle.objects.all().order_by('id')
    serializer_class = VehicleSerializer
    permission_classes = [permissions.IsAuthenticated]
