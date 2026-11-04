package exercicio2;
import java.time.LocalDate;

public class Data {
	
	private int mes;
	private int dia;
	private int ano;
	private LocalDate dataNow;
	
	Data (int dia, int mes, int ano){
		if ((dia >= 1) && (dia <= 31))
			this.dia = dia;
		else 
			this.dia = 1;
		
		if ((mes >= 1) && (mes <= 12))
			this.dia = mes;
		else 
			this.dia = 1;
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void displayData() {
		System.out.println(dia + "/" + mes + "/" + ano);
	}
	
	Data(){
		this.dataNow = LocalDate.now();
	}
	
	public LocalDate getDataNow() {
		System.out.println(dataNow);
		return dataNow;
	}
}
