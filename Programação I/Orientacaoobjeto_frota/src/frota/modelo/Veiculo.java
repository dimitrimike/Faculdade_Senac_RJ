package frota.modelo;

public class Veiculo {
	private String placa;
	private String modelo;
	private double capacidadeTanque;
	private double combustivelDisponivel=0;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}
	
	public void setcapacidadeTanque (double capacidade) {
		this.capacidadeTanque = capacidade;
	}
	public double getCombustivelDisponivel() {
		return combustivelDisponivel;
	}
	
	public void abastecer (double litros) {
		double novaLitragem = this.combustivelDisponivel + litros;
		if (novaLitragem <= this.capacidadeTanque)
			this.combustivelDisponivel = novaLitragem;	
		else
			System.out.println("Tanque não comporta mais " + litros + " litros");
	}
	
	public boolean viajar(double distancia, double consumoKmLitro) {
		double quantidadeLitros = distancia / consumoKmLitro;
	
		return (quantidadeLitros <= this.combustivelDisponivel);
	}
}
