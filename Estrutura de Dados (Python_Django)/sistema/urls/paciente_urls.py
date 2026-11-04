from django.urls import path
from sistema.views import *

url_patterns = [
    path('paciente/', index), # vollmed.com/paciente
    path('paciente/novo/'), # vollmed.com/paciente/novo/
    path('paciente/perfil/<int:paciente_id>'), # vollmed.com/paciente/perfil
    path('paciente/listegem', listar_pacientes), # vollmed.com/paciente/listegem

]
# path variable