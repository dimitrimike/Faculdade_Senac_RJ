
public class Ex5 {
	public static void main(String[] args) {
		
		int num = 5;
		long fatorial = 1;
		for (int i = 1; i <= num; i++) {
			fatorial = fatorial * i;
		}
		System.out.println("Fatorial de " + num + "=" + fatorial);
	}
}
