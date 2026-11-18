import VEICULOS.Carro;

public class MainAluno {
	public static void main(String[] args) {
		
		int num;
		int num1;
		
		Aluno al1 = new Aluno();
		Aluno al2 = new Aluno();
		
		//objeto al1
		al1.nome = "Diovanna";
		al1.matricula = 123456;
		
		Carro carro1 = new Carro();
		carro1.fabricante = "Honda";
		carro1.modelo = "Fit";
		carro1.anoFab = 2020;
		
		//objeto al2
		al2.nome = "Lucas";
		al2.matricula = 123321;
		
		System.out.println("Aluno 1: " + al1.nome);
		System.out.println("Aluno 2: " + al2.nome);
	}

}
