package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	//ATTRIBUTES
	private LocalDate manufactureDate;
	
	//CONSTRUCTOR
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	//GETTER AND SETTER
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(": (used) $" + String.format("%.2f", price));
		sb.append(" (Manufacture date: " + dtf.format(manufactureDate) + ")");
		return sb.toString();
	}
}


