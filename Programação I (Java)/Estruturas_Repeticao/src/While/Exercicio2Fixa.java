package While;

import java.util.Scanner;

public class Exercicio2Fixa {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(system.in);
		
		int soma = 0;
		int num =1;
		
		while (num !=0) {
			System.out.println("Entre com um numero: ");
			num = input.nextInt();
			
			if (num !=0) {
				soma = soma + num;
			}
		}
		System.out.println("SOMA FINAL: " + soma);
	}
}
