import java.util.ArrayList;

public class exemplo3 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Diovanna");
		nomes.add("Bob");
		nomes.add("Barbara");
		nomes.add("Gabriel");
		nomes.add("Gabrielle");
		nomes.add("Samara");
		
		for (String texto: nomes){
			System.out.println("nome: " + texto);
		}
		
		System.out.println("Tamanho da lista: " + nomes.size());
		System.out.println("3o elemento: " + nomes.get(2));
		
		System.out.println("1o elemento: " + nomes.get(0));
		System.out.println("Trocando 1o elemento da lista");
		nomes.set(0, "Cauã");
		System.out.println("1o elemento: " + nomes.get(0));
		for (String texto: nomes){
			System.out.println("nome: " + texto);
		}
		
		System.out.println("Removendo 1o elemento da lista");
		nomes.remove(0);
		for (String texto: nomes){
			System.out.println("nome: " + texto);
		}
		
		System.out.println("Removendo Gabriel da lista");
		nomes.remove("Gabriel");
		for (String texto: nomes){
			System.out.println("nome: " + texto);
		}
		
		if (nomes.contains("Barbara")) {
			System.out.println("Barbara está Aprovada");
		}
	}

}
