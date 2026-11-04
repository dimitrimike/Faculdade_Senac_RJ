package exercicio4;

public class Lampada {
	
	private boolean estado; // true: acessa false: apagada
	private int potencia;
	
	Lampada(boolean estadoInicial){
		this.potencia=100;
		this.estado=estadoInicial;
	}
	
	Lampada(boolean estadoInicial){
		this.potencia=;
		this.estadoInicial=estadoInicial;
	}
	
	public void acender() {
		this.estado=true;
	}
	
	public void apagar() {
		this.estado=false;
	}
	
	public int informarPotencia() {
		return(this.potencia);
	}
	
	public int informarSituacao() {
		if (this.estado)
			return("Acesa")
		else (this.estado)
			return("Apagada")
	}

}
