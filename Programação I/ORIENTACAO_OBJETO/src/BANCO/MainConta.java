package BANCO;

public class MainConta {
	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.agencia = 5;
		cc1.conta = 123456;
		
		System.out.println("Conta: " + cc1.conta);
		System.out.println("Agencia: " + cc1.agencia);
		System.out.println("Saldo: R$" + cc1.getSaldo());
		
		cc1.depositar(100);
		System.out.println("Novo saldo: " + cc1.getSaldo());
		
//		if (cc1.sacar(150)) {
//			System.out.println("Saque relaizado");
//			System.out.println("Novo saldo: " + cc1.getSaldo());
//		}else {
//			System.out.println("Saldo Insuficiente");
//		}
		
		cc1.sacar(50);
		System.out.println("Novo saldo: " + cc1.getSaldo());
	}
}
