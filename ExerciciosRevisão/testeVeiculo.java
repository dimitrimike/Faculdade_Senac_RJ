package Ex2;

public class testeVeiculo {

	public static void main(String[] args) {
		Veiculo carro1 = new Veiculo();
		
		carro1.setModelo("Honda");
		carro1.setPlaca("ABC1D34"); 
		carro1.setTipo(2);
		carro1.setValorVenal(100000.0);
		
		System.out.println("Valor: " + carro1.getValorVenal());
		System.out.println("IPVA:" + carro1.calcularIPVA());

	}

}
