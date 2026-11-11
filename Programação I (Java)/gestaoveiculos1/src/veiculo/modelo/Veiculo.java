package veiculo.modelo;

public class Veiculo {
	
	public String placa;
	public String modelo;
	public int tipo; 
	public double valorVenal;
	
	public double calcularIPVA() {
		double aliquota;
		if (tipo==1)
			aliquota=0.04;
		else if (tipo==2)
			aliquota=0.02;
		else if (tipo==3)
			aliquota=0.015;
		else 
			aliquota=0.01;
		System.out.println("IPVA do veículo " + modelo + " é de " + valorVenal*aliquota + " reais");
		return valorVenal*aliquota;
	}
	
}
