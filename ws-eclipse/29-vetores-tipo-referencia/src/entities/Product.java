package entities;

public class Product {
	
	//ATTRIBUTES
	private String name;
	private double price;
	
	//CONSTRUCTOR
	public Product() {
		
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//GETTER AND SETTER
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		 this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
