package VEICULOS;

public class MainCarro {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		carro1.fabricante = "Honda";
		carro1.modelo = "Fit";
		carro1.anoFab = 2020;
		
		carro2.fabricante = "Fiat";
		carro2.modelo = "Uno";
		carro2.anoFab = 2012;
		
		System.out.println("Carro1: " + carro1.modelo + "ano: " + carro1.anoFab);
		System.out.println("Carro2: " + carro2.modelo + "ano: " + carro2.anoFab);
		
		//carro1
		for (int i=0; i<=5; i++) {
			System.out.println("Acelerando:");
			System.out.println("Carro1: " + carro1.getVelocidade + " km/h");
			System.out.println("Carro2: " + carro2.getVelocidade + " km/h");
			carro1.acelerar(20);
		}
		
		for (int i=0; i<=5; i++) {
			System.out.println("Freando:");
			System.out.println("Carro1: " + carro1.getVelocidade + " km/h");
			System.out.println("Carro2: " + carro2.getVelocidade + " km/h");
			carro1.frear();
		}
	}

}
