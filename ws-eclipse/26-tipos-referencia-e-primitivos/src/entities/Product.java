package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return name + " / " + String.format("%.2f", price) + " / " + quantity;
	}
	
	
}
