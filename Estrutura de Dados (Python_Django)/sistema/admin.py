<<<<<<< HEAD:WORKSPACE Estrutura de Dados/sistema/admin.py
from django.contrib import admin
from sistema import models

@admin.register(models.Paciente) # Registo o Paciente no Portal do Python
class PacienteAdmin(admin.ModelAdmin):
    list_display = ('id', 'nome', 'email', 'telefone', 'ativo',)
    
@admin.register(models.Medico) # Registo o Médico no Portal do Python
class MedicoAdmin(admin.ModelAdmin):
    list_display = ('id', 'nome', 'email', 'telefone', 'especialidade', 'crm', 'ativo',)
    
@admin.register(models.Consulta)
class ConsultaAdmin(admin.ModelAdmin):
=======
from django.contrib import admin
from sistema import models

@admin.register(models.Paciente) # Registo o Paciente no Portal do Python
class PacienteAdmin(admin.ModelAdmin):
    list_display = ('id', 'nome', 'email', 'telefone', 'ativo',)
    
@admin.register(models.Medico) # Registo o Médico no Portal do Python
class MedicoAdmin(admin.ModelAdmin):
    list_display = ('id', 'nome', 'email', 'telefone', 'especialidade', 'crm', 'ativo',)

@admin.register(models.Consulta)
class ConsultaAdmin(admin.ModelAdmin):
>>>>>>> 325ef1e162b9fa694feff91785a710609b7efe2f:Estrutura de Dados (Python_Django)/sistema/admin.py
    list_display = ('id', 'paciente_id', 'medico_id', 'status',)