package arrays;

import java.util.Random;

public class Array_Matriz {

	public static void main(String[] args) {
		
		int i, j;
		
		int pop [][] = new int[5][5];
		
		Random rand = new Random();
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				pop[i][j] = rand.nextInt(100);
			}
		}
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				System.out.print(pop[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		
		
		
	}
	
}
