package empresa.teste;

import empresa.modelo.*;

public class TesteFuncionario1 {
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.cargo = 1;
		f1.nome = "Bob";
		f1.salario = 10000;
		f1.registro = 123;
		
		System.out.println("Salario Antigo: " + f1.salario);
		f1.aplicarBonificação();
		System.out.println("Salario Novo: " + f1.salario);
	}
}
