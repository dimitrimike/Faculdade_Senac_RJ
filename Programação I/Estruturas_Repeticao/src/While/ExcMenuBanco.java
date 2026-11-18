package While;

import java.util.Scanner;

public class ExcMenuBanco {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;
		boolean opcapInvalida;
		do {
			System.out.println("MENU");
			System.out.println("1 - Ver Saldo");
			System.out.println("2 - Sacar");
			System.out.println("3 - Sair");
			
			System.out.println("Entre com a opção: ");
			opcao = input.nextInt();
			
			opcaoInvalida = (opcao < 1 || opcao > 3)?true:false;
			if (opcaoInvalida) {
				System.out.println("Opcao Invalida!!!");
			}
		} while (opcao !=3);
		System.out.println("FIM DO PROGRAMA");
	} 
}
