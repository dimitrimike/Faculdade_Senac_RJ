package While;

import java.util.Random;
public class ExcSorteio {
	
	public static void main(String[] args) {

		Random random = new Random();
		int numeroAleatorio;
//		for (int i = 0; i< 6; i++) {
//			int numeroAleatorio = random.nextInt(100);
//			System.out.println("Número escolido: " + numeroAleatorio);
//		}
		
		do {
			int numeroAleatorio = random.nextInt(6);
			System.out.println("Número escolido: " + numeroAleatorio);
		} while (numeroAleatorio !=5);
	}
	

}
