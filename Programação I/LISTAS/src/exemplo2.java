import java.util.ArrayList;
import java.util.Scanner;

public class exemplo2 {
	
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
		
		System.out.println("Lista1 - tamanho: "+ nomes.size());
		for (String texto: nomes) {
			System.out.println("nome: " + texto);
		}
		
		System.out.println("+++++++++++++++++++++++++");
		
		nomes.add(1, "Bob");// colocando Bob na 2a posição
		System.out.println("Lista2 - tamanho: "+ nomes.size());
		for (String texto: nomes){
			System.out.println("nome: " + texto);
		}
	}

}