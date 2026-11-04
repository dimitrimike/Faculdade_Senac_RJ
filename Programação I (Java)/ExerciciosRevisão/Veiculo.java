package Ex2;

public class Veiculo {

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
		switch (this.tipo) {
		case 1:
			aliquota = 0.04;
			break;
		case 2:
			aliquota = 0.02;
			break;
		case 3:
			aliquota = 0.015;
			break;
		default:
			aliquota = 0.01;
			break;
		}
		return (this.valorVenal*aliquota);
	}

}
