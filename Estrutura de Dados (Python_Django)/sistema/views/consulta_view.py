from django.shortcuts import render
from django.http import HttpResponse

def consulta_view(request):
    print('Página consulta funcionou')
    return HttpResponse('Página inicial do consulta')