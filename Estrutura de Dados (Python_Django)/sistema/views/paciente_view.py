from django.shortcuts import render
# from django.http import HttpResponse
from sistema.models import Paciente

def index(request):
    return render(
        request,
        'global/base.html',
        )


def listar_pacientes(request):
    paciente = Paciente.objects.all() # -> [obj1, obj2, obj3]

    context = {
        'paciente': paciente, 
    }

    return render(
        request,
        'paciente/listar.html',
        context,
        )