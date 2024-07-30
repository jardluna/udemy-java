package application;

import java.util.Locale;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println("Valor de X: $" + String.format("%.2f", x.getBalance()));
		System.out.println("Valor de Y: $" + String.format("%.2f", y.getBalance()));
		
	}
}


