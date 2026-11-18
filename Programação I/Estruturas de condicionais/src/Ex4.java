
public class Ex4 {
	public static void main(String[] args) {
		double lado1 = 1.1;
		double lado2 = 1.1;
		double lado3 = 1.1;
		
		boolean ehTriangulo = (lado3<lado1+lado2) &&
					          (lado2<lado1*lado3) &&
					          (lado1<lado2+lado3)? true:false;
		boolean ladosIguais = (lado1==lado2) && (lado2==lado3)? true:false;
		boolean ladosNaoIguais = (lado1!=lado2) && 
				                 (lado2!=lado3) &&
				                 (lado1!=lado3) ? true:false;
		
		if (ehTriangulo){
			if (ladosIguais){
				System.out.println("Equilatero");
				} else if (ladosNaoIguais){
					System.out.println("Escaleno");
				} else {
					System.out.println("Isósceles");
				}
		} else {
			System.out.println("Não é triangulo");
		}
	  }
	}
