package veiculo.teste;

import veiculo.modelo.Veiculo;

public class TesteVeiculo1 {

	public static void main(String[] args) {
		Veiculo carro1 = new Veiculo();
		carro1.modelo = "Corsa";
		carro1.placa = "abc1234";
		carro1.tipo = 1;
		carro1.valorVenal = 20600;
		
		System.out.println(carro1.modelo + " placa " + carro1.placa + " tipo "+  carro1.tipo + " FIPE " + carro1.valorVenal);
		carro1.calcularIPVA();
	}

}
