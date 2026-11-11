package variaveis;

public class TesteOperadoresIncrementoDecremento1 {
	public static void main(String[] args) {
		System.out.println("Pre-fixado");
		int x = 5;
		System.out.println("x = " + x);
		System.out.println("x = " + ++x);
		System.out.println("x = " + x);
		System.out.println("x = " + --x);
		System.out.println("x = " + x);
		System.out.println("Pós-fixado");
		System.out.println("x = " + x++);
		System.out.println("x = " + x);
		System.out.println("x = " + x--);
		System.out.println("x = " + x);
	}
}
