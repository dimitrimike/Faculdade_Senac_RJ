
public class Calculadora {
	
	//metodo não estatico
	public double soma (double num1, double num2) {
		return (num1 + num2);
	}
	
	//metodo estatico
	public static double multiplica(double num1, double num2) {
		return (num1*num2);
	}
	
	public static void main(String[] args) {
		double num1 = 9.5;
		double num2 = 1.5;
		
		Calculadora calc1 = new Calculadora();
		
		System.out.println("Soma: " + calc1.soma(num1,  num2));
		
		System.out.println("Multiplicação: " + Calculadora.multiplica(num1, num2));
	}

}
