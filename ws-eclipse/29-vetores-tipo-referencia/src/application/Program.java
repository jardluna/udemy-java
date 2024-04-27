package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//VETOR COM CLASSES
		System.out.println("*** VECTOR ***");
		System.out.println();
		
		System.out.print("Quantity of position: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println();
			System.out.printf("Name in position [%d]:", i);
			String name = sc.nextLine();
			System.out.printf("Price in position [%d]: ", i);
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		System.out.println();
		System.out.printf("Average Price: %.2f", avg);
		
		sc.close();
	}

}
