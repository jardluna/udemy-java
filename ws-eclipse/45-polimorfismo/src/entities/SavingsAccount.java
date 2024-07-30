package entities;

public final class SavingsAccount extends Account {

	//ATTRIBUTES
	private Double interestRate;
	
	//CONSTRUCTOR
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	//GETTER AND SETTER
	public Double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	//METHOD
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public final void withdraw(double amount) {
		super.withdraw(amount);
		balance += 5.0;
	}
	
 }


