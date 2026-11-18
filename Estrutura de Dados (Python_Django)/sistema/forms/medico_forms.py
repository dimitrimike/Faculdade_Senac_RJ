from django.forms import forms
from sistema.models import Medico
 
# Checagem de email -> O emailfield do model já valida se é email válido
# Checagem de dado inserido -> Dependendo o Field do atributo.

ESPECIALIDADES = [
    ('CARDIOLOGIA', 'Cardiologia'),
    ('DERMATOLOGIA', 'Demartologia'),
    ('GINECOLOGIA', 'Ginecologia'),
    ('NEUROLOGIA', 'Neurologia'),
    ('OFTALMOLOGIA', 'Oftalmologia'),
    ('PIDIATRIA', 'Pediatria'),
]

# Formulário do Médico (usado para cadastro e edificação)
class MedicoForm(forms.ModelForm):
    # Troca o Charfiel padrão por um <select> com opções fixas
    especialidades = forms.ChoiceField(
        choices=[('', 'Selecione uma especialidade')] + ESPECIALIDADES
    )

    class Meta:
        model = Medico
        fields = ['nome', 'sobrenome', 'email', 'telefone', 'crm', 'especialidade'] # criacao_data e ativo não aparecem: são preenchidos automaticamente.

        labels = {
            'nome': 'Nome',
            'sobrenome': 'Sobrenome',
            'email': 'E-mail',
            'telefone': 'Telefone',
            'crm': 'CRM',
        }