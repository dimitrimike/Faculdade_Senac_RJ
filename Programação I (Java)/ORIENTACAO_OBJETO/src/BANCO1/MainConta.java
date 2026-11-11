package BANCO1;

public class MainConta {
	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setAgencia(5);
		cc1.setConta(12345);
		
		System.out.println("Agencia: " + cc1.getAgencia());
		System.out.println("Conta: " + cc1.getConta());
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
