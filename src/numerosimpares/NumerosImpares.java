package numerosimpares;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int numero = input.nextInt();
		
		int i;
		
		
		System.out.println("Os impares s�o: ");
		
		for(i=1; i<=numero; i++) {
			
			int resto = i%2;
			
			if (resto != 0) {
			
				System.out.println(i);
				int soma =+ i;
				
			}
			
		}
		System.out.println("O valor da soma dos �mpares � : " + soma);
		
		
		
		
		input.close();
	}
	
	
	

}
