package While;

import java.util.Scanner;

public class Input3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int opcao
		System.out.println("Escolha a opção: ");
		System.out.println("1 - continua a escolha");
		System.out.println("2 - Imprime e continua a escolha");
		System.out.println("0 - sai");
		
		System.out.println("Entre com a opção desejada: ");
		opcao = input.nextInt();
		
		// menu simples
		while (opcao !=0) {
			//imprimir menu
			
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
