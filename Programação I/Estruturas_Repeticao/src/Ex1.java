
public class Ex1 {
	public static void main(String[] args) {
		
		for (int contador = 10; contador >= 0; contador--) {
			if (contador != 0) {
				System.out.println("Detonação em: " + contador);
			} else {
				System.out.println("Foguete lançado!");
			}
		}
	}
}
