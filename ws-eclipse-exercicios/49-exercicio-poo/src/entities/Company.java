 package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public final double tax() {
		double taxTotalComp = 0.0; //TAX TOTAL COMPANY
		if(numberOfEmployees > 10) {
			taxTotalComp = anualIncome * 0.14;
		} else {
			taxTotalComp = anualIncome * 0.16;
		}
		return taxTotalComp;
	}
	
}


