from django.contrib import admin
from . import models

@admin.register(models.Professor)
class ProfessorAdmin(admin.ModelAdmin):
    list_display = ('id', 'nome', 'disciplina', 'telefone', 'ativo',)

@admin.register(models.Aluno)
class AlunoAdmin(admin.ModelAdmin):
    list_display = ('id', 'nome', 'telefone', 'ativo',)

@admin.register(models.Turma)
class TurmaAdmin(admin.ModelAdmin):
    list_display = ('id', 'turma', 'turno', 'professor_id', 'aluno_id', 'ativo',)