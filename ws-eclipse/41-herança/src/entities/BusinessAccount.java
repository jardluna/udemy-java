package entities;

public class BusinessAccount extends Account {

	//ATTRIBUTES
	private Double loanLimit;
	
	//CONSTRUCTOR
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	//GETTER AND SETTER
	public Double getLoanLimit() {
		return loanLimit;
	}
	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	//METHOD
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10;
		}
	}
}


