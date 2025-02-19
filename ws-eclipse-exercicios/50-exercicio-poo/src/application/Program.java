package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: $");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: $");
			double withdrawLimit = sc.nextDouble();
			Account acc = new Account(number, holder, initialBalance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter for amount withdraw: $");
			double amount = sc.nextDouble();
			acc.withdraw(amount);
			System.out.println(acc);
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error...");
		}
		finally {
			sc.close();
		}
	}
}


