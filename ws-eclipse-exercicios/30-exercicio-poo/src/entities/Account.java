package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	//CONSTRUCTOR
	public Account() {
		
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	//GETTERS AND SETTERS
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//METHODS
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public String toString() {
		return String.format("- Account: %d %n", number)
				+ String.format("- Holder: %s %n", holder.toUpperCase())
				+ String.format("- Balance: $%.2f", balance);
	}
}


