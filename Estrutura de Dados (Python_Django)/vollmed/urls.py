<<<<<<< HEAD:WORKSPACE Estrutura de Dados/vollmed/urls.py
from django.contrib import admin
from django.urls import path, include
import sistema.urls # Forma diferente de importar

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', include(sistema.urls)), # Preciso chamar as urls do app sistema
    # path('') # Preciso chamar as urls do app portal
]

   
    








# www.vollmed.online/
# www.vollmed.online/login
# www.vollmed.online/

# MEDICO
# www.vollmed.online/medico/id/ -> Perfil do médico
# www.vollmed.online/medico/id/alterar -> Alterar cadastro do médico

# www.vollmed.online/medico/id/consultas

# PACIENTE
# www.vollmed.online/paciente/id/ -> Perfil do paciente
# www.vollmed.online/paciente/id/alterar -> Alterar cadastro do paciente

# www.vollmed.online/paciente/id/consultas/cadastrar/
# www.vollmed.online/paciente/id/consultas/id/ -> ver,alterar,deletar.


# SECRETARIO/SUPERUSER
# www.vollmed.online/secretario/id/ -> Perfil do secretario
# www.vollmed.online/secretario/id/alterar -> Alterar cadastro do secretario

# www.vollmed.online/secretario/id/consultas/cadastrar/
# www.vollmed.online/secretario/id/consultas/id/ -> ver,alterar,deletar.


# CONSULTA
=======
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
>>>>>>> 325ef1e162b9fa694feff91785a710609b7efe2f:Estrutura de Dados (Python_Django)/vollmed/urls.py
