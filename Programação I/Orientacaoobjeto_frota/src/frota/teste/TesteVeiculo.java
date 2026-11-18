package frota.teste;

import frota.modelo.Veiculo;

public class TesteVeiculo {
	
	public static void main(String[] args) {
		Veiculo carro1 = new Veiculo ();
		
		carro1.setModelo ("Honda City");
		carro1.setPlaca ("ABC12D4");
		carro1.setcapacidadeTanque(40);
		
		System.err.println("Dados do Veiculo: ");
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getCombustivelDisponivel()+ "/" + carro1.getCapacidadeTanque() + " litros");
		
		System.out.println("Abastecendo");
		carro1.abastecer(30);
		System.out.println(carro1.getCombustivelDisponivel() + "/" + carro1.getCapacidadeTanque() + " litros");
		
		if (carro1.viajar(400, 10))
			System.out.println("Viagem possivel");
		else
			System.out.println("Sem combustivel suficiente");
	}
}
