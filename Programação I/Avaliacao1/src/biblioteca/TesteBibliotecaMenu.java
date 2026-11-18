package biblioteca;

import java.util.Scanner;

public class TesteBibliotecaMenu {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;
		
		LivroAcervo livro1 = new LivroAcervo("Epico", 2221, 20);
		
		do {
			System.out.println("Menu");
			System.out.println("1. Consultar Livro");
			System.out.println("2. Registrar Empréstimo: ");
			System.out.println("3. Registrar Devolução: ");
			System.out.println("4. Sair: ");
			System.out.print("opção:");
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				livro1.consultarLivro();
				break;
			case 2:
				System.out.println("Número de exemplares requeridos: ");
				livro1.realizarEmprestimo(input.nextInt());
				break;
			case 3:
				System.out.println("Número de exemplares devolvidos: ");
				livro1.realizarDevolucao(input.nextInt());
				break;
			case 4:
				System.out.println("Saindo...");
				break;
			}
		} while (opcao != 4);
	}
}
