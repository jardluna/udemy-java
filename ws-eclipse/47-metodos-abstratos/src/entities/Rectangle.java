package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

	//ATTRIBUTES
	private Double width;
	private Double height;
	
	//CONSTRUCTOR
	public Rectangle() {
		super();
	}

	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	//GETTER AND SETTER
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	//METHOD
	@Override
	public final double area() {
		return width * height;
	}
	
}


