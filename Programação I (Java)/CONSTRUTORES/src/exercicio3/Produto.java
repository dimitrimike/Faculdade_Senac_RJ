package exercicio3;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	Produto (String nome, double preco, int quantidade){
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double calcularValorTotal() {
		System.out.println("Valor total do produto: " + nome + " " + preco*quantidade + " reais.");
		return preco*quantidade;
	}

}
