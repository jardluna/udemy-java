package entities;

import java.util.Date;

public class HourContract {

	//ATTRIBUTES
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	//CONTRUCTOR
	public HourContract() {
		
	}
	
	public HourContract(Date date, double valuePerHour, int hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	//GETTER AND SETTER
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public double getValuePerHour() {
		return valuePerHour;
	}
	
	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	//METHOD
	public double totalValue() {
		return valuePerHour * hours;
	}
	
}


