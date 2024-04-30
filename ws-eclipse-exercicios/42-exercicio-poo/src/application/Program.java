package application;

import java.util.Scanner;
import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** Boarding House ***");
		System.out.println();
		System.out.print("Number of rooms? ");
		int q = sc.nextInt();
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		System.out.printf("(the rooms are from 0 to %d) %n", q - 1);
		System.out.println();
		
		Rent[] vect = new Rent[q];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Rent #%d: %n", i + 1);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.next();
			String sobrenome = sc.next();
			System.out.print("Email: ");
			sc.nextLine();
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			if(vect[room] == null) {
				vect[room] = new Rent(name, sobrenome, email, room);
			}
			else {
				do {
					System.out.println();
					System.out.println("** unavailable room **");
					System.out.println("** Choose another room **");
					System.out.print("Room: ");
					room = sc.nextInt();
				} while(vect[room] != null);
				vect[room] = new Rent(name, sobrenome, email, room);
			}
			System.out.println();
		}
		
		System.out.println("Busy Rooms: ");
		for(int i = 0; i < q; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
			else if(vect[i] == null) {
				System.out.println(i + ": [- available room -]");
			}
		}
		
		sc.close();
	}

}


