<<<<<<< HEAD:WORKSPACE Estrutura de Dados/sistema/urls/consulta_urls.py
from django.urls import path
from sistema.views import consulta_view

urlpatterns = [
    path('consulta/', consulta_view), # vollmed.com/consulta 
]
=======
from django.urls import path
from sistema.views import consulta_view

url_patterns = [
    path('consulta/', consulta_view), # vollmed.com/consulta
    path('consulta/novo/'), # vollmed.com/consulta/novo/
    path('consulta/perfil/<int:consulta_id>'), # vollmed.com/consulta/perfil
    path('consulta/listegem'), # vollmed.com/consulta/listegem
]
>>>>>>> 325ef1e162b9fa694feff91785a710609b7efe2f:Estrutura de Dados (Python_Django)/sistema/urls/consulta_urls.py
