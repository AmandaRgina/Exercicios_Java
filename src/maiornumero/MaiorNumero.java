package maiornumero;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero");
		
		int numero1 = input.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		
		int numero2 = input.nextInt();
		
		System.out.println("Digite o terceiro n�mero");
		
		int numero3 = input.nextInt();
		
		if (numero1 > numero2 && numero2 > numero3) {
			
			System.out.println("o maior n�mero � " + numero1);
			System.out.println("o segundo maior n�mero � " + numero2);
			System.out.println("o menor n�mero � " + numero3);
			
		}
		
		else if (numero2 > numero1 && numero1 > numero3) {
			
			System.out.println("o maior n�mero � " + numero2);
			System.out.println("o segundo maior n�mero � " + numero1);
			System.out.println("o menor n�mero � " + numero3);
		}
		
		else if (numero1 > numero2 && numero3 > numero1) {
			
			System.out.println("o maior n�mero � " + numero3);
			System.out.println("o segundo maior n�mero � " + numero1);
			System.out.println("o menor n�mero � " + numero2);
		}
		
		else if (numero3 > numero2 && numero2 > numero1) {
			
			System.out.println("o maior n�mero � " + numero3);
			System.out.println("o segundo maior n�mero � " + numero2);
			System.out.println("o menor n�mero � " + numero1);

		}
		
		
		
		else if (numero1 > numero3 && numero3 > numero2) {
			
			System.out.println("o maior n�mero � " + numero1);
			System.out.println("o segundo maior n�mero � " + numero3);
			System.out.println("o menor n�mero � " + numero2);
			
		}
		
		else {
			
			System.out.println("Os n�meros s�o iguais");
		}
		
		input.close();
	}

}
