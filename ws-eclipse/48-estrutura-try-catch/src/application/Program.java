package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("END OF PROGRAM");
		
	}
	
	public static void method1() {
		System.out.println("-- METHOD1 START --");
		method2();
		System.out.println("-- METHOD1 END --");
	}
	
	public static void method2() {
		System.out.println("-- METHOD2 START --");
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Nomes: ");
			String[] vect = sc.nextLine().split(" ");
			System.out.print("Posição: ");
			int position = sc.nextInt();
			System.out.println();
			System.out.println("Resposta: " + vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println();
			System.out.println("Input error!");
			e.printStackTrace();
		}
		
		sc.close();
		System.out.println("-- METHOD2 END --");
	}
}


