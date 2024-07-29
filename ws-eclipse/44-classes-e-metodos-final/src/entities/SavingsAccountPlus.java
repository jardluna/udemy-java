package entities;

public class SavingsAccountPlus { //extends SavingsAccount NÃO PODE SER HERDADA SE SUA CLASSE (SUPERCLASSE) FOR FINAL

	//ATTRIBUTES
	private Double bonus;
	
	//CONSTRUCTOR
	public SavingsAccountPlus() {
		
	}
	
	public SavingsAccountPlus(Double bonus) {
		this.bonus = bonus;
	}
	
	//GETTER AND SETTER
	public Double getBonus() {
		return bonus;
	}
	
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
}


