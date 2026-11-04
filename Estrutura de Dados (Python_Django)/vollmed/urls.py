from django.contrib import admin
from django.urls import path, include

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', include('sistema.urls.py')) # Preciso chamar as urls do app portal
    # path('') # Preciso chamar as urls do app sistema
]






























# www.vollmed.online/
# www.vollmed.online/login
# www.vollmed.online/


# MEDICO
# www.vollmed.online/medico/id -> perfil médico
# www.vollmed.online/medico/id/alterar -> Alterar cadastro do médico

# www.vollmed.online/medico/id/consultas


# PACIENTE
# www.vollmed.online/paciente/id -> perfil paciente
# www.vollmed.online/paciente/id/alterar -> Alterar cadastro do paciente

# www.vollmed.online/medico/id/consultas/cadastrar/
# www.vollmed.online/medico/id/consultas/id - ver,alterar,deletar.


# CONSULTA