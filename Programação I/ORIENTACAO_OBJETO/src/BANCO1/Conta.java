package BANCO1;

public class Conta {
	private int agencia;
	private int conta;
	private int saldo=0;
	
	public void setAgencia(int agNum) {
		
		this.agencia = agNum;
	}
	
	public int getAgencia() {
		return(this.agencia);
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public int getConta() {
		return this.conta;
	}

	

	
	
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
