package exercicio1;

public class Retangulo {
	
	private double largura;
	private double altura;
	
	Retangulo (double largura, double altura){
		this.largura = largura;
		this.altura = altura;
		}
	
	public double calularArea() {
		System.out.println(largura * altura);
		return largura * altura;
	}
	
	public double calularPerimetro() {
		double perimetro = (largura * 2) + (altura*2);
		System.out.println(perimetro);
		return perimetro;
	}
	
}
