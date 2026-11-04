package loja.modelo;

public class Produto {
	
	private int codigo;
	private String descricao;
	private int quantidadeEstoque;
	private double precoUnitario;
	
	Produto (int codigo, String descricao, int quantidadeEstoque, double precoUnitario){
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidadeEstoque = quantidadeEstoque;
		this.precoUnitario = precoUnitario;
	}
	
	public void adicionarEstoque(int qtd) {
		this.quantidadeEstoque += qtd;
	}
	
	public boolean removerEstoque(int qtd) {
		if 
		return()
	}

}
