package srings;

import java.util.Scanner;

public class Validador_email {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu email: ");
		String email = sc.nextLine();
		
		if (email.indexOf("@") !=-1){
			System.out.println("Email válido");
		} else
			System.out.println("Email invalido, precisa conter '@'");
		
		email.trim();
		
		if (email.indexOf(" ") !=-1){
			System.out.println("Email válido");
		} else
			System.out.println("Email invalido, não pode haver espaços");
		
		
		
	}

}
