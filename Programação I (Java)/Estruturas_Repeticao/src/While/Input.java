package While;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		
		String texto;
		int num;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Entre com Número: ");
		num = input.nextInt();
		System.out.println("num= " + num);
		
		input.close();
	}

}
