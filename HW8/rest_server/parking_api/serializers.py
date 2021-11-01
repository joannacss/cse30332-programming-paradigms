from .models import Owner, Vehicle
from rest_framework import serializers

class OwnerSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = Owner
        fields = ['id', 'name', 'email']

class VehicleSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = Vehicle
        fields = ['id', 'owner','license_plate','state']
