package empresa.modelo;

public class Funcionario {
	public int registro;
	public String nome;
	public int cargo;
	public double salario;
	
	public void aplicarBonificação () {
		double bonificacao=0;
		switch (cargo) {
		case 1:
			bonificacao = 0.2;
			break;
		case 2:
			bonificacao = 0.4;
			break;
		case 3:
			bonificacao = 0.6;
			break;
		default:
			bonificacao = 0;
			break;
		}
		salario = salario * (1 + bonificacao);
	}

}

// switch case equivale a varios if