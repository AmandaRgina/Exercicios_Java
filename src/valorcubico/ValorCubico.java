package valorcubico;

import java.util.Scanner;

public class ValorCubico {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
		
		int numero = input.nextInt();
		
	    int i;
		
		for (i=1; i<=numero; i++) {
			
			System.out.println("O numero �: " + i);
			System.out.println("O seu valor c�bico �: " + (i*i));
			
			input.close();
		
		}
		
	
		
	}

}
