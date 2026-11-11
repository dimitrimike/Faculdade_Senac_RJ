
public class Ingresso {
	
	private int codigo;
	private String nomeEvento;
	private double preco;
	private boolean situacaoUso;
	
	Ingresso (int codigo, String nomeEvento, double preco){
		this.codigo = codigo;
		this.nomeEvento = nomeEvento;
		this.preco = preco;
		this.situacaoUso = true;
	}
	
	public void consultarPreco() {
		System.out.println("Valor do ingresso para: " + this.nomeEvento + " é de R$" + this.preco);
	}
	
	public double aplicarDesconto (double descontoPercentual) {
		if (descontoPercentual >= 0 && descontoPercentual <= 100) {
	        double valorDesconto = this.preco * (descontoPercentual / 100);
	        this.preco -= valorDesconto;
	    } else {
	        System.out.println("Percentual de desconto inválido!");
	    }
		return this.preco;
	}
	
	public boolean registrarUtilizacao() {
		if (this.situacaoUso) {
			System.out.println("Ingresso válido, bom evento!");
			this.situacaoUso = false;
			return true;
		} else {
			System.out.println("Ingresso inválido!");
			return false;
		}
	}
}
