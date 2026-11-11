<<<<<<< HEAD:WORKSPACE Estrutura de Dados/sistema/urls/medico_urls.py
from django.urls import path
from sistema.views import medico_view

urlpatterns = [
    path('medico/', medico_view), # vollmed.com/medico
]
=======
from django.urls import path
from sistema.views import medico_view

url_patterns = [
    path('medico/', medico_view), # vollmed.com/medico
    path('medico/novo/'), # vollmed.com/medico/novo/
    path('medico/perfil/<int:medico_id>'), # vollmed.com/medico/perfil
    path('medico/listegem') # vollmed.com/medico/listegem
]
>>>>>>> 325ef1e162b9fa694feff91785a710609b7efe2f:Estrutura de Dados (Python_Django)/sistema/urls/medico_urls.py
