package arraysAndCollections;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		int gradesAmount, studentAmount;
		double gradesMedia, gradesAdd= 0, gradesAddFinal = 0;
		
		System.out.print("Informe a quantidade de alunos na turma: ");
		studentAmount = entry.nextInt();
		
		System.out.print("\n\nInforme a quantidade de notas a serem passadas: ");
		gradesAmount = entry.nextInt();

		double[][] grades = new double[studentAmount][gradesAmount];
	
		for(int counter1 = 0; counter1 < studentAmount;  counter1++) {
			
			System.out.print("\n\nInforme as notas do aluno de número: " + (counter1+1));
			
			for(int counter2 = 0; counter2 < gradesAmount; counter2++) {
				System.out.print("\n Informe a nota " + (counter2 + 1) + ": ");
				grades[counter1][counter2] = entry.nextDouble();
				
			}
			
		}

		for(int counter1 = 0; counter1 < studentAmount; counter1++ ) {
			
			gradesAdd = 0;
			
			for(int counter2 = 0; counter2 < gradesAmount; counter2++) {
				
				gradesAdd += grades[counter1][counter2];
				
			}
			
			
			gradesAddFinal += gradesAdd;
			
		}
		
		gradesMedia = gradesAddFinal / (studentAmount * gradesAmount);
		
		System.out.println("\n\nA média das notas informadas é equivalente a: " + gradesMedia);
		
		entry.close();
		
	}
	
}
