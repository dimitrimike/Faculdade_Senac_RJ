from django.db import models # ORM do Django para declarar modelos no banco de dados.
from django.utils import timezone # Útil para gerar data/hota atual no projeto.

# Modelo que representa uma consulta 
# id, id do paciente, id do medico, horario/data, obs, status
class Consulta(models.Model):
    paciente_id = models.ForeignKey(Paciente, on_delete=models.CASCADE) # Chave estrangeira
    medico_id = models.ForeignKey(Medico, on_delete=models.CASCADE) # Chave estrangeira
    data_consulta = models.DateTimeField(default=timezone.now) #Data/hota da consulta
    ativa = models.BooleanField(default=True) # Campo de exclusão lógica
    observacao = models.TextField(blank=True) # Anotação opcional
    status = models.CharField(
        default='A',
        max_length=1,
        choices=[
            ('A', 'Agendada'),
            ('X', 'Cancelada'),
            ('C', 'Confirmada'),
            ('R', 'Realizada'),
        ]
    )