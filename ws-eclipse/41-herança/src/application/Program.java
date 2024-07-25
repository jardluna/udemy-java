package application;

import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		
		BusinessAccount bacc = new BusinessAccount(1774, "Nubank", 200.00, 6000.00);
		
		System.out.println(bacc.getBalance());
	}
}
