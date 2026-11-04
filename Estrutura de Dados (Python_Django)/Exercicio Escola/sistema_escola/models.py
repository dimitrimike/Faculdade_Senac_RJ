from django.db import models
from django.utils import timezone

class Professor(models.Model):
    disciplina = models.CharField(max_length=20)
    nome = models.CharField(max_length=25)
    idade = models.IntegerField(max_length=3)
    cpf = models.CharField(max_length=14)
    endereco = models.CharField(max_length=30)
    telefone = models.CharField(max_length=20)
    ativo = models.BooleanField(default=True)
    data_cadastro = models.DateTimeField(default=timezone.now)

    def __str__(self):
        return f'{self.nome}'


class Aluno(models.Model):
    matricula = models.CharField(max_length=20)
    nome = models.CharField(max_length=25)
    idade = models.IntegerField(max_length=3)
    cpf = models.CharField(max_length=14)
    endereco = models.CharField(max_length=30)
    telefone = models.CharField(max_length=20)
    ativo = models.BooleanField(default=True)
    data_cadastro = models.DateTimeField(default=timezone.now)

    def __str__(self):
            return f'{self.nome}'


class Turma(models.Model):
    turma = models.CharField(max_length=15)
    turno = models.CharField(max_length=10)
    professor_id = models.ForeignKey(Professor, on_delete=models.CASCADE)
    aluno_id = models.ForeignKey(Aluno, on_delete=models.CASCADE)
    ativo = models.BooleanField(default=True)
    data_cadastro = models.DateTimeField(default=timezone.now)
    observacao = models.TextField(blank=True)

    def __str__(self):
            return f'{self.turma}' 


