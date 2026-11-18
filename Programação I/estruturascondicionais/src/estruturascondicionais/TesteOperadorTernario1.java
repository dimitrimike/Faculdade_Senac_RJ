package estruturascondicionais;

public class TesteOperadorTernario1 {
	public static void main(String[] args) {
		int idade = 16;
		System.out.println("idadde = " + idade);
		System.out.println(idade>=18 ? "Adulto" : "Não adulto");
		boolean votante;
		votante = (idade>=16) ? true : false;
		System.out.println(votante ? "Pode votar" : "Não pode votar");
	}
}
