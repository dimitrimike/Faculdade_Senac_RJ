package livraria.modelo;

public class Livro {
	
	private int codigo;
	private String titulo;
	private double preco;
	private int quantidadeEstoque;
	
	public void aplicarDesconto(double percentual) {
		this.preco = this.preco - (this.preco * percentual / 100);
	}
	
	public boolean vender(int quantidade) {
		if (quantidade > this.quantidadeEstoque) {
			return(false);
		}else {
			this.quantidadeEstoque = this.quantidadeEstoque - quantidade;
			return(true);
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
}
