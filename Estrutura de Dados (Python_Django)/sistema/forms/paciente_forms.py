from django.forms import forms
from sistema.models import Paciente

class PacienteForm(forms.ModelForm):
    class Meta:
        model = Paciente
        fields = ['nome', 'sobrenome', 'email', 'telefone', 'cpf', 'mensagem']
        # criacao_data e ativo não aparecem: são preenchidos automaticamente.
        labels = {
            'nome': 'Nome',
            'sobrenome': 'Sobrenome',
            'email': 'E-mail',
            'telefone': 'Telefone',
            'cpf': 'CPF',
            'mensagem': 'Mensagem',
        }