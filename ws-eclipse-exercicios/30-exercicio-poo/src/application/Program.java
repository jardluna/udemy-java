package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n): ");
		char response = sc.next().charAt(0);
			
		if(response == 'y' || response == 'Y') {
			System.out.print("Enter initial deposit value: $");
			double initialDeposit = sc.nextDouble();
			acc = new Account(number, holder, initialDeposit);
		}
		else if(response == 'n' || response == 'N') {
			acc = new Account(number, holder);
		}
		else {
			do {
				System.out.println();
				System.out.println("*** INVALID OPTION. TRY AGAIN ***");
				System.out.println();
				System.out.print("Is there na initial deposit (y/n): ");
				response = sc.next().charAt(0);
			}while((response != 'y' && response != 'Y') && (response != 'n' && response != 'N'));
			
			if(response == 'y' || response == 'Y') {
				System.out.print("Enter initial deposit value: $");
				double initialDeposit = sc.nextDouble();
				acc = new Account(number, holder, initialDeposit);
			}
			else if(response == 'n' || response == 'N') {
				acc = new Account(number, holder);
			}
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(acc);
		System.out.println();
		System.out.print("Enter a DEPOSIT value: $");
		double deposit = sc.nextDouble();
		acc.deposit(deposit);
		System.out.println("Account data:");
		System.out.println(acc);
		System.out.println();
		System.out.print("Enter a WITHDRAW value: $");
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		System.out.println("Account data:");
		System.out.println(acc);
		
		System.out.println();
		System.out.print("Do you wish to continue? (y/n): ");
		char responseCon = sc.next().charAt(0);
		
		while(responseCon == 'y' || responseCon == 'Y') {
			System.out.print("Deposit or Withdraw? (d/w): ");
			char responseDW = sc.next().charAt(0);
			System.out.println();
			
			if(responseDW == 'd' || responseDW == 'D') {
				System.out.print("Enter a DEPOSIT value: $");
				deposit = sc.nextDouble();
				acc.deposit(deposit);
			}
			else if(responseDW == 'w' || responseDW == 'W') {
				System.out.print("Enter a WITHDRAW value: $");
				withdraw = sc.nextDouble();
				acc.withdraw(withdraw);
			}
			else {
				System.out.println();
				System.out.println("*** INVALID OPTION. TRY AGAIN ***");
				System.out.println();
			}

			System.out.println("Account data:");
			System.out.println(acc);
			System.out.println();
			System.out.print("Do you wish to continue? (y/n): ");
			responseCon = sc.next().charAt(0);
		}
		
		System.out.println();
		System.out.println("*** SESSION CLOSED ***");
		
		sc.close();
	}
}


