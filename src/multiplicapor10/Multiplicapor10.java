package multiplicapor10;

import java.util.Scanner;

public class Multiplicapor10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor a ser multiplicado por 10");
		
		double numero = input.nextDouble();
		
		int multiplicador = 0;
		double resultado = 0;
		
		do {
			
			resultado = multiplicador * numero;
			System.out.print(numero + " ");
			System.out.print('x' + " ");
			System.out.print(multiplicador + " = ");
			System.out.println(resultado);
			
			multiplicador ++;
			}
		
		while (multiplicador <= 10);
		
		input.close();
											}
	

								}
