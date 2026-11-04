package While;

public class ElevadorCarga {
	public static void main(String[] args) {
		int peso = 0;
		
		while (peso<100) {
			System.out.println("Peso atual: " + peso + "kg");
			peso=peso+20;
		}
		System.out.println("Atingido o limite " + peso + "kg");
	}
}
