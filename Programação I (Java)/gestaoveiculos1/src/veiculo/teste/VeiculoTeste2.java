package veiculo.teste;

import veiculo.modelo2.Veiculo2;

public class VeiculoTeste2 {
	
	public static void main(String[] args) {
			Veiculo2 carro1 = new Veiculo2();
			carro1.setModelo("Corsa");
			carro1.setPlaca("abc12d4");
			carro1.setTipo(1);
			carro1.setValorVenal(20600);
			
			System.out.println(carro1.getModelo() + " placa " + carro1.getPlaca() + " tipo "+  carro1.getTipo() + " FIPE " + carro1.getValorVenal());
			carro1.calcularIPVA();
		}

}
