package logistica.modelo;

public class EnvioPriv {
	private String codigoRastreio;
	private double pesoKg;
	private int tipoEntrega;
	private double valorFrete;
	
	public String getCodigoRastreio() {
		return codigoRastreio;
	}
	public void setCodigoRastreio(String codigoRastreio) {
		this.codigoRastreio = codigoRastreio;
	}
	public double getPesoKg() {
		return pesoKg;
	}
	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}
	public int getTipoEntrega() {
		return tipoEntrega;
	}
	public void setTipoEntrega(int tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	
	public double calcularValorFrete() {
		switch (this.tipoEntrega) {
		case 1:
			this.valorFrete = 10 + 5*pesoKg;
			break;
		case 2:
			this.valorFrete = 25 + 9*pesoKg;
			break;
		case 3:
			this.valorFrete = 60 + 20*pesoKg;
			break;
		default:
			this.valorFrete = 15 + 4*pesoKg;
		}
		return (this.valorFrete);
	}
}
