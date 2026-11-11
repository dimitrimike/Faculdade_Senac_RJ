/*
 * Crie um programa que imprima os multiplos de um numero entre 0 e 100
 */
public class Ex3 {
	public static void main(String[] args) {
		
		int numero = 7;
		int soma = 0;
		
		System.out.println("Múltiplos de " + numero);
		System.out.println("=============");
		for (int i = 0; i <= 100; i++) {
			if (i % numero == 0) {
				System.out.println(i);
				soma = soma + i;
			}
		}
		System.out.println("Soma dos múltiplos: " + soma);
	}
}
