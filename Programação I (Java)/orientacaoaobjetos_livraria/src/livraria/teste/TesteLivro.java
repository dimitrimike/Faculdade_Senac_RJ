package livraria.teste;

import livraria.modelo.Livro;

public class TesteLivro {
	
	public static void venda (Livro l1, int quantidadeVenda) {
		System.out.println("Livro: " + l1.getTitulo());
		if (l1.vender(quantidadeVenda))
	}
	
	public static void main(String[] args) {
		Livro livro1 = new Livro();
		livro1.setCodigo(1111);
		livro1.setTitulo("Java avançado");
		livro1.setPreco(110.50);
		livro1.setQuantidadeEstoque(20);
		
		
		System.out.println("Título: " + livro1.titulo + "/" + livro1.codigo);
		System.out.println("Preço padrão do livro: " + livro1.preco);
		liv1.aplicarDesconto(15);
		System.out.println("Preço com desconto do livro " + livro1.titulo + ": " + livro1.preco);
		
		liv1.vender(5);
		}
	
	// comprar livro1 em 3 parcelas
	double valorParcela = CalculadoraFinanciamento.calcularPacela(livro1.getPreco(), 3)
			System.out.println("Livro: " + livro1getTitulo() + " preço: " + livro);
}
