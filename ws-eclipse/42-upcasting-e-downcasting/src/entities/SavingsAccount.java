package entities;

public class SavingsAccount extends Account {

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
}


