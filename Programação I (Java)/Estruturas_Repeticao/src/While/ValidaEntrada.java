package While;

import java.util.Scanner;

public class ValidaEntrada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int valor = 0;
		
		while ((valor >= 0) && (valor<=10)) {
			System.out.println("Entre com um valor de 0 a 10: ");
			valor = input.nextInt();
		}
		System.out.println("FIM do PROGRAMA");
	}
}
