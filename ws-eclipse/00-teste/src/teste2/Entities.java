package teste2;

public class Entities {
	
	private String name;
	private double price;
	private int quantity;
	
	public Entities(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String toString() {
		return name + " / " 
				+ String.format("%.2f", price) + " / " 
				+ quantity;
	}
	
	
}
