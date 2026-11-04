from django.urls import path
from sistema.views import consulta_view

url_patterns = [
    path('consulta/', consulta_view), # vollmed.com/consulta
    path('consulta/novo/'), # vollmed.com/consulta/novo/
    path('consulta/perfil/<int:consulta_id>'), # vollmed.com/consulta/perfil
    path('consulta/listegem'), # vollmed.com/consulta/listegem
]