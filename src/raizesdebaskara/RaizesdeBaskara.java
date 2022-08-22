package raizesdebaskara;

import java.util.Scanner;

public class RaizesdeBaskara {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de 'a'");
		
		int a = input.nextInt();
		
		System.out.println("Digite o valor de 'b'");
		
		int b = input.nextInt();
		
		System.out.println("Digite o valor de 'c'");
		
		int c = input.nextInt();
		
		double delta = ((b*b)-4*(a*c));
		
		double x1 = (-b + Math.sqrt(delta))/(2*a);
		
		double x2 = (-b - Math.sqrt(delta))/(2*a);
		
		if (delta < 0) {
			
			System.out.println("A equação não possui raízes");
		}
		
		else if (delta > 0) {
			
			
			
			System.out.println("As raízez são: ");
			System.out.println("x1: " + x1);
			System.out.println("x2: " + x2);
		}
		
		else {
			
			System.out.println("A raíz é: "+ x1);
		}
		
		input.close();
	}
}
