from django.forms import forms
from sistema.models import Consulta

class ConsultaForms(forms.ModelForm):
    class Meta:
        model = Consulta
        fields = ['observacao', 'observacao',]
        # criacao_data e ativo não aparecem: são preenchidos automaticamente.
        labels = {
            'observacao': 'Observacao',
            'status': 'Status',
        }