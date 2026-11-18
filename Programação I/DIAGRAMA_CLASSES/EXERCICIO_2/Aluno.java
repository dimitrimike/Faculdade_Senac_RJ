
public class Aluno {

	// Atributos (conforme UML)
	private String matricula;
	private String nome;
	public String email; // na UML está com "+", ou seja, público
	private double n1;
	private double n2;
	private double n3;

	// Contrutor (não está na UML, mas é usual)
	public Aluno(String matricula, String nome, String email,
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	)
	
}
