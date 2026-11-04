package VEICULOS;

public class Carro {
	protected String fabricante;
	public String modelo;
	public int anoFab;
	
	private int velocidade = 0;
	
	public void acelerar(int incremento) {
		//velocidade+=10; // velocidade = velocidade + 10
		velocidade = velocidade + incremento;
	}
	
	public void frear() {
		if (velocidade>0)
			velocidade-=10; // velocidade = velocidade - 10
	}
	
	public int getVelocidade() {
		return(velocidade);
	}

}
