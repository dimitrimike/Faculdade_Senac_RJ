package Ex1;

public class Veiculo {

	public String placa;
	public String modelo;
	public int tipo;
	public double valorVenal;

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
