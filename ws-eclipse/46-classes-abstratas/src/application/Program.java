package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));
		
		double sum1 = 0.0;
		for(Account acc : list) {
			sum1 += acc.getBalance();
		}
		System.out.printf("Total balance: $%.2f \n", sum1);
		System.out.println();
		
		double sum2 = 0.0;
		for(Account acc : list) {
			acc.deposit(10.0);
			sum2 += acc.getBalance();
		}
		
		for(Account acc : list) {
			System.out.printf("Updated balance for account %d: $%.2f \n", 
					acc.getNumber(), acc.getBalance());
		}
		System.out.println();
		
		System.out.printf("Total balance: $%.2f \n", sum2);
	}
}


