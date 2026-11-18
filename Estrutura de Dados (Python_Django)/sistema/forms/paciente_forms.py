from django.forms import forms
from sistema.models import Paciente

# Formulário de Paciente (usado para cadastro e edição)
class PacienteForm(forms.ModelForm):
    "No model Paciente o CPF tem 11 char, mas aqui podemos aceitar até 14"
    cpf = forms.CharField(
        max_length=14,
        label="CPF",
    )
    class Meta:
        model = Paciente
        fields = ['nome', 'sobrenome', 'email', 'telefone', 'cpf', 'mensagem'] # criacao_data e ativo não aparecem: são preenchidos automaticamente.
        labels = {
            'nome': 'Nome',
            'sobrenome': 'Sobrenome',
            'email': 'E-mail',
            'telefone': 'Telefone',
            'cpf': 'CPF',
            'mensagem': 'Mensagem',
        }