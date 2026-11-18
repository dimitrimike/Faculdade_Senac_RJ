import java.util.ArrayList;
import java.util.Scanner;

public class exemplo {
	
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		
		String nome;
		
		do {
			System.out.println("Entre com um nome: ");
			nome = input.nextLine();
			
			if (nome.equals("SAIR"))
				break;
			
			nomes.add(nome);
		} while (true);
		
		for (String texto: nomes) {
			System.out.println("nome: " + texto);
		}
	}

}
