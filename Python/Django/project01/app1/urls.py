from django.urls import path
from . import views

app_name = 'app1'  # creates a namespace for this application


urlpatterns = [
    # ex: /polls/
    path('', views.index, name='index'),
]