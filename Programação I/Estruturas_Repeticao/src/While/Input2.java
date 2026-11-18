package While;

import java.util.Scanner;

public class Input2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// menu simples
		int opcao = 1;
		while (opcao !=0) {
			//imprimir menu
			System.out.println("Escolha a opção: ");
			System.out.println("1 - continua a escolha");
			System.out.println("2 - Imprime e continua a escolha");
			System.out.println("0 - sai");
			
			System.out.println("Entre com a opção desejada: ");
			opcao = input.nextInt();
			
			if (opcao!=0) {
				if (opcao==1) {
					System.out.println("Escolhi 1");
				} else if (opcao==2){
					System.out.println("Escolhi 2");
				} else {
					System.out.println("***Opção inválida***");
				}
			}
		}
		System.out.println("FIM DO PROGRAMA");
	}

}
