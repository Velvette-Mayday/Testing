package teste;

import java.util.Scanner;

public class ExercicioTeste {

	public static void main(String[] args) {
		
		double a, b, c, delta, x, y;
		
		Scanner entry = new Scanner(System.in);
	
		System.out.print("Insira o valor de A: ");
		a = entry.nextDouble();
		
		System.out.print("\n\nInsira o valor de B: ");
		b = entry.nextDouble();
		
		System.out.print("\n\nInsira o valor de C: ");
		c = entry.nextDouble();
		
		entry.close();
	
		delta = (b*b) - (4*a*c);
		
		if(delta > 0) {
			
			x = ((-1*b) + Math.sqrt(delta)) / (2*a);
			y = ((-1*b) - Math.sqrt(delta)) / (2*a);
			
			System.out.println("\n\nA equação possui 2 raízes, sendo elas:\nx: " + x + "\ny: " + y );
			
		} else if(delta == 0) {
			
			x = ((-1*b) + Math.sqrt(delta)) / (2*a);
			
			System.out.println("\n\nA equação possui 1 raíz, sendo ela:\nx: " + x );
			
		} else {
			
			System.out.println("\n\nA equação não possui raíz");
			
		}
		
		
	}
	
}
