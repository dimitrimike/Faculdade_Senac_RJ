<<<<<<< HEAD:WORKSPACE Estrutura de Dados/sistema/urls/paciente_urls.py
from django.urls import path
from sistema.views import * 

# vollmed.com/admin
# vollmed.com/paciente => index
# vollmed.com/paciente/novo => index

urlpatterns = [
    path('paciente/', index_paciente),  # vollmed.com/paciente
    # path('paciente/novo/'),  # vollmed.com/paciente/novo/
    # path('paciente/perfil/<int:paciente_id>'), # vollmed.com/paciente/perfil/<int:paciente_id>
    # path('paciente/listagem', listar_pacientes), # vollmed.com/paciente/listagem    
]
 # path variable
=======
from django.urls import path
from sistema.views import *

url_patterns = [
    path('paciente/', index), # vollmed.com/paciente
    path('paciente/novo/'), # vollmed.com/paciente/novo/
    path('paciente/perfil/<int:paciente_id>'), # vollmed.com/paciente/perfil
    path('paciente/listegem', listar_pacientes), # vollmed.com/paciente/listegem

]
# path variable
>>>>>>> 325ef1e162b9fa694feff91785a710609b7efe2f:Estrutura de Dados (Python_Django)/sistema/urls/paciente_urls.py
