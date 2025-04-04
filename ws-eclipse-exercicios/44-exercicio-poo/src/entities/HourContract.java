package entities;

import java.time.LocalDate;

public class HourContract {

	//ATTRIBUTES
	private LocalDate date;
	private Double valuePerHour;
	private Integer hours;
	
	//CONTRUCTOR
	public HourContract() {
		
	}
	
	public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	//GETTER AND SETTER
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	//METHOD
	public Double totalValue() {
		return valuePerHour * hours;
	}
	
}


