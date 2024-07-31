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
		double sum = 0.0;
		if(numberOfEmployees <= 10) {
			sum = anualIncome * 0.16;
		} else {
			sum = anualIncome * 0.14;
		}
		return sum;
	}
	
}


