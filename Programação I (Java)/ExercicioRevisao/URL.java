package Ex31;

public class URL {
	
	private String urlCompleta;
	private String urlLimpa;
	
	URL (String url){
		this.urlCompleta=url;
	}
	
	public boolean AjustaURL() {
		String urlTrim = this.urlCompleta.trim();
		String urlLowerCase = urlTrim.toLowerCase();
		//String urlTrim = this.toLowerCase().urlCompleta.trim(); 
		
		if (urlLowerCase.indexOf("https://")==-1)
			return(false);
		else {
			this.urlLimpa = urlLowerCase.substring(8, urlLowerCase.length());
			return(true);
		}
			
	}
	
	public void mostraDominio() {
		String dominio = this.urlLimpa.substring(0,this.urlLimpa.indexOf("/"));
		
		System.out.println("Dominio: " + dominio);
	}

	//TESTANDO
	public static void main(String[] args) {
		URL url = new URL("https://www.senacrio.BR/CURSOS");
		
		if (url.AjustaURL())
			url.mostraDominio();
		else
			System.out.println("erro na url");

	}

}
