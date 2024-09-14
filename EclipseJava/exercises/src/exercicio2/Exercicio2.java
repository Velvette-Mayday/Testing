package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		String ans = "";
		double a1, a2;
		String operator;
		double r;
		
		
		while(!ans.equalsIgnoreCase("x")) {
			
			System.out.println("\nDigite dois números: ");
			a1 = entry.nextDouble();
			a2 = entry.nextDouble();
			
			System.out.println("\nDigite o operador aritmético:\nadd para adição\nsub para subtração\nmul para multiplicação\ndiv para divisão: ");
			operator = entry.next();
			
			switch (operator) {
			
			case "add": 
				r = a1 + a2;
				System.out.println("\nO resultado é: " + r);
				break;
			
			case "sub":
				r = a1 - a2;
				System.out.println("\nO resultado é: " + r);
				break;
			
			case "mul":
				r = a1 * a2;
				System.out.println("\nO resultado é: " + r);
				break;
				
			case "div":
				if(a2 == 0) {
					System.out.println("\nInsira um divisor diferente de zero!");
				} else {
					r = a1 / a2;
					System.out.println("\nO resultado é: " + r);
					break;
				}
			default:
				System.out.println("\nInsira um operador válido!"); 
			}
			
			System.out.println("\nDigite x para sair, ou qualquer outra letra para continuar");
			ans = entry.next();
		}
		
		entry.close();
		System.out.println("\nFechando!");
	}
	
}
