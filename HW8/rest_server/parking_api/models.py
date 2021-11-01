from django.db import models

# Create your models here.
class Owner(models.Model):
	name = models.CharField(max_length=200)
	email = models.CharField(max_length=200)

class Vehicle(models.Model):
	owner = models.ForeignKey('Owner', on_delete=models.CASCADE)
	license_plate = models.CharField(max_length=200)
	state = models.CharField(max_length=20)
