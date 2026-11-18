
public class Funcionario {
	
	private int matricula;
	private String nome;
	private double salarioBase;
	private double percentualBonus;
	
	Funcionario (int matricula, String nome, double salarioBase, double percentualBonus){
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.percentualBonus = percentualBonus;
	}
	
	public double calcularSalarioFinal () {
		if (this.percentualBonus>=0) {
			double valorBonus = this.salarioBase * (this.percentualBonus / 100);
			double valorFinal = this.salarioBase + valorBonus;
			return valorFinal;	
		} else {
			System.out.println("Erro, percentual bônus menor que 0%");
			return this.salarioBase;
		}	
	}

}
