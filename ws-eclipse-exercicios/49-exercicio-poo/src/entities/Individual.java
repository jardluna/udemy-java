package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditure;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditure) {
		super(name, anualIncome);
		this.healthExpenditure = healthExpenditure;
	}

	public Double getHealthExpenditure() {
		return healthExpenditure;
	}

	public void setHealthExpenditure(Double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}
	
	@Override
	public final double tax() {
		double basicTaxInd = (anualIncome <= 20000.0) ? anualIncome * 0.15 : anualIncome * 0.25; //BASIC TAX INDIVIDUAL
		double healthTaxInd = (healthExpenditure > 0.0) ? healthExpenditure * 0.5 : healthExpenditure; //HEALTH TAX INDIVIDUAL
		double taxTotalInd = basicTaxInd - healthTaxInd; //TAX TOTAL INDIVIDUAL
		if(taxTotalInd <= 0) {
			taxTotalInd = 0.0;
		}
		return taxTotalInd;
	}
	
}


