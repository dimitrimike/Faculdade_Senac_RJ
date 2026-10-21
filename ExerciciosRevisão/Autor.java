package Ex33;

public class Autor {

	private String nome;
	private String pix;
	
	Autor(String nomeA, String pix){
		this.nome = nomeA;
		this.pix = pix;
	}
	
	public void converteNome(){
		String inicial = this.nome.substring(0,1);
		String nome2 = this.nome.substring(this.nome.indexOf(" ")+1, this.nome.length());
		
		String nomeCitacao = nome2.toUpperCase() + ", " + 
		                     inicial.toUpperCase() +".";
		
		System.out.println("nome Citação: " + nomeCitacao);
	}
	
	public void formataPix() {
		String ddd = this.pix.substring(0,2);
		String prefix = this.pix.substring(2,3);
		String sufix = this.pix.substring(7, this.pix.length());
		
		String pixFormatado = "+55 (" + ddd + ") " + prefix + "****" + sufix;
				
		System.out.println("pix Formatado: " + pixFormatado);
	}

	
	
	//Testando
	public static void main(String[] args) {
		Autor autor = new Autor("Roberto Harkovsky", "21999998888");
		
		autor.converteNome();
		autor.formataPix();
	}

}
