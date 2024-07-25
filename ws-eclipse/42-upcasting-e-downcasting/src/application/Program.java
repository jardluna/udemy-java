package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1774, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1775, "Maria", 100.0, 300.0);
		SavingsAccount sacc = new SavingsAccount(1776, "Jack", 200.0, 450.0);
		
		//UPCASTING - CASTING DA SUBCLASSE PARA A SUPERCLASSE
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1777, "Bob", 300.00, 600.0);
		Account acc3 = new SavingsAccount(1778, "Anna", 400.00, 750.0);
		
		//DOWNCASTING - CASTING DA SUPERCLASSE PARA A SUBCLASSE
		BusinessAccount bacc1 = (BusinessAccount)acc2;
		bacc1.loan(100.0);
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount bacc2 = (BusinessAccount)acc3;
			bacc2.loan(200.0);
			System.out.println("Loan!");
		} else if (acc3 instanceof SavingsAccount) {
			SavingsAccount sacc1 = (SavingsAccount)acc3;
			sacc1.updateBalance();
			System.out.println("Update!");
		}
		
		System.out.println(acc3.getBalance());
	}
}


