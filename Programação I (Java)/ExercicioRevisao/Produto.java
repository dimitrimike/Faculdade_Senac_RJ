package Ex2a;

public class Produto {
	private int codigo;  
	private String descricao; 
	private int quantidadeEstoque; 
	private double precoUnitario;
	
	Produto(String descricao, double preco, int codigo){
		this.descricao = descricao;
		this.precoUnitario = preco;
		this.codigo= codigo;
		this.quantidadeEstoque = 0;
	}
	
	public void adicionarEstoque(int qtd) {
		this.quantidadeEstoque += qtd;
	}
	
	public boolean removerEstoque(int qtd) {
		if (qtd > this.quantidadeEstoque) {
			System.out.println("Sem estoque para " + qtd + " unidades");
			return(false);
		} else {
			this.quantidadeEstoque -= qtd;
			return(true);
		}
	}
	
	public void consultarEstoque() {
		System.out.println("Estoque: " + this.quantidadeEstoque + " unidades");
	}
	
}
