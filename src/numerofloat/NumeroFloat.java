package numerofloat;

import java.util.Scanner;

public class NumeroFloat {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		
		float numero = input.nextFloat();
		
		if (numero == 0) {
			
			System.out.println("o valor do número é zero");
		}
		
		if (numero < 1 && numero > 0) {
			
			System.out.println("Número pequeno");
		}
		
		if(numero > 1000000) {
			
			System.out.println("Número muito grande");
		}
		
		if (numero < 0) {
			
			System.out.println("Negativo");
		}
		
		if (numero > 0 && numero>=1) {
			
			System.out.println("Positivo");
		}
		
		
		input.close();
	}

}
