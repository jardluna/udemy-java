package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//VETORES COM TIPOS PRIMITIVOS
		System.out.println("*** VECTOR ***");
		System.out.println();
		
		System.out.print("Quantity of position: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Vector in position [%d] - ", i);
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
				
		double avg = sum / vect.length;
		System.out.println();
		System.out.printf("Average: %.2f", avg);
				
		sc.close();
		
	}
}
