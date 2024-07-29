package entities;

public class BusinessAccountPlus extends BusinessAccount {
	
	//ATTRIBUTES
	private Double bonus;
	
	//CONSTRUCTOR
	public BusinessAccountPlus() {
			
	}
	
	public BusinessAccountPlus(Double bonus) {
		this.bonus = bonus;
	}	
		
	//GETTER AND SETTER
	public Double getBonus() {
		return bonus;
	}
		
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	
	//METHOD
	@Override
	public void withdraw(double amount) { //NÃO PODE SER SOBREPOSTO SE O METODO NA CLASSE BusinessAccount (SUPERCLASSE) FOR FINAL
		super.withdraw(amount);
		balance -= 5.0;
	}
}


