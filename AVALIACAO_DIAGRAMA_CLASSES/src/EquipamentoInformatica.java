
public class EquipamentoInformatica {
	
	private String patrimonio;
	private String descricao;
	private String fabricante;
	private double valorAquisicao;
	
	EquipamentoInformatica (String patrimonio, String descricao, String fabricante, double valorAquisicao){
		this.patrimonio = patrimonio;
		this.descricao = descricao;
		this.fabricante = fabricante;
		this.valorAquisicao = valorAquisicao;
	}
	
	public double atualizarValor (double novoValor){
		this.valorAquisicao = novoValor;
		return this.valorAquisicao;
	}
	
	public void informarResumoDados () {
		System.out.println("Patrimonio: " + this.patrimonio);
		System.out.println("Descricao: " + this.descricao);
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Valor de aquisicao: R$" + this.valorAquisicao);
	}
	
	public boolean verificarValorLimite (double valorLimite) {
		return this.valorAquisicao >= valorLimite;
	}

}

