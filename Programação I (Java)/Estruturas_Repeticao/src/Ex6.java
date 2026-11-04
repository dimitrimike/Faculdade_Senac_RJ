
public class Ex6 {
	public static void main(String[] args) {
		
		int num = 114;
		int divisores = 2; // ele é divisivel por 1 e ele mesmo
		
		for (int i = 2; i < num; i++) {
			if (num % i==0) {
				divisores = divisores + 1;
				System.out.println(i + " é divisor de " + num);
			}
		}
		if (divisores > 2) {
			System.out.println(num + " Não é primo");
		} else {
			System.out.println(num + " É primo");
		}
	}

}
