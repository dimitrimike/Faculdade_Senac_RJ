package questao6;

public class Mascara {
	
	private String numCartao;
	
	Mascara(String numCartao){
		this.numCartao = numCartao;
	}
	
	public void mascararNumeroCartao() {
		String sufix = this.numCartao.substring(12, this.numCartao.length());
		System.out.println("****-****-****-" + sufix);
	}
	
	public static void main(String[] args) {
		Mascara cartao1 = new Mascara("1234567812345678");
		
		cartao1.mascararNumeroCartao();
	}

}
