package positivoounegativo;

import java.util.Scanner;

public class PositivoouNegativo {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o n�mero e direi se � positivo ou negativo");
		
		double numero = input.nextDouble();
		
		if (numero < 0) {
			
			System.out.println("Este n�mero � negativo");
		}
		
		else if (numero > 0) {
			
			System.out.println("Este n�mero � positivo");
		}
		
		else {
			
			System.out.println("N�mero neutro");
		}
		
		input.close();
		
	}

}
