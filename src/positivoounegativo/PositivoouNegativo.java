package positivoounegativo;

import java.util.Scanner;

public class PositivoouNegativo {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número e direi se é positivo ou negativo");
		
		double numero = input.nextDouble();
		
		if (numero < 0) {
			
			System.out.println("Este número é negativo");
		}
		
		else if (numero > 0) {
			
			System.out.println("Este número é positivo");
		}
		
		else {
			
			System.out.println("Número neutro");
		}
		
		input.close();
		
	}

}
