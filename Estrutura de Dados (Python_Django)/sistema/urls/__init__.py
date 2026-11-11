<<<<<<< HEAD:WORKSPACE Estrutura de Dados/sistema/urls/__init__.py
from .paciente_urls import urlpatterns as paciente_urlpatterns
from .medico_urls import urlpatterns as medico_urlpatterns
from .consulta_urls import urlpatterns as consulta_urlpatterns

urlpatterns = paciente_urlpatterns + medico_urlpatterns + consulta_urlpatterns


    

=======
from .paciente_urls import *
from .medico_urls import *
from .consulta_urls import *
>>>>>>> 325ef1e162b9fa694feff91785a710609b7efe2f:Estrutura de Dados (Python_Django)/sistema/urls/__init__.py
