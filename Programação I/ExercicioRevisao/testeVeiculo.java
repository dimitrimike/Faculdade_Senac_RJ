package Ex1;

public class testeVeiculo {

	public static void main(String[] args) {
		Veiculo carro1 = new Veiculo();
		
		carro1.modelo = "Honda";
		carro1.placa = "ABC1D34";
		carro1.tipo = 4;
		carro1.valorVenal = 100000.0;
		
		System.out.println("Valor: " + carro1.valorVenal);
		System.out.println("IPVA:" + carro1.calcularIPVA());

	}

}
