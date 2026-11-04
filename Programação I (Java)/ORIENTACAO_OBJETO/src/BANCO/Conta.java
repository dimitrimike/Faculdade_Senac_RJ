package BANCO;

public class Conta {
	public int agencia;
	public int conta;
	private int saldo=0;
	
	public void depositar (int valor) {
		saldo=+valor; // saldo = saldo + valor
	}
	
	public boolean sacar (int valor) {
		if (saldo-valor>=0) {
			saldo-=valor;
			System.out.println("Saque realizado");
			return(true);
		}
		System.out.println("Saldo Insufuciente");
		return(false);
	}
	
	public int getSaldo() {
		return(saldo);
	}

}
