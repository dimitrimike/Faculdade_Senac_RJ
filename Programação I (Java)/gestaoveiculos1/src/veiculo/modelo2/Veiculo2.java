package veiculo.modelo2;

public class Veiculo2 {
	
	private String placa;
	private String modelo;
	private int tipo; 
	private double valorVenal;
	
	
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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getValorVenal() {
		return valorVenal;
	}

	public void setValorVenal(double valorVenal) {
		this.valorVenal = valorVenal;
	}



	public double calcularIPVA() {
		double aliquota;
		if (this.tipo==1)
			aliquota=0.04;
		else if (this.tipo==2)
			aliquota=0.02;
		else if (this.tipo==3)
			aliquota=0.015;
		else 
			aliquota=0.01;
		System.out.println("IPVA do veículo " + this.modelo + " é de " + this.valorVenal*aliquota + " reais");
		return this.valorVenal*aliquota;
	}

}
