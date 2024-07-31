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
		double sum = 0.0;
		if(anualIncome <= 20000 && healthExpenditure > 0) {
			sum = (anualIncome * 0.15) - (healthExpenditure * 0.5);
		} else if(anualIncome <= 20000 && healthExpenditure <= 0) {
			sum = (anualIncome * 0.15) - healthExpenditure;
		} else if(anualIncome > 20000 && healthExpenditure > 0) {
			sum = (anualIncome * 0.25) - (healthExpenditure * 0.5);
		} else if(anualIncome > 20000 && healthExpenditure <= 0) {
			sum = (anualIncome * 0.25) - healthExpenditure;
		}
		return sum;
	}
	
}


