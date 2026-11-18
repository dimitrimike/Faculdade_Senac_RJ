package Ex2a;

import java.util.Scanner;

public class TesteLoja {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;
		int quantidade;
		
		Produto p1 = new Produto("Celular", 1500.0, 1);

		do {
			//menu
			System.out.println("Menu");
			System.out.println("1. Consultar Estoque");
			System.out.println("2. Entrada de Mercadoria: ");
			System.out.println("3. Saída de Mercadoria: ");
			System.out.println("4. Encerrar: ");
			System.out.print("opção:");
			opcao = input.nextInt();	
			
			//tratar a opcao
			switch (opcao) {
			case 1:
				p1.consultarEstoque();
				break;
			case 2:
				System.out.print("Entre com a quantidade: ");
				quantidade = input.nextInt();
				p1.adicionarEstoque(quantidade);
				break;	
			case 3:
				System.out.print("Entre com a quantidade: ");
				p1.removerEstoque(input.nextInt());
				break;
			case 4:
				System.out.println("Saindo...");
				break;
			}
			
			
		} while (opcao != 4);
		

	}

}
