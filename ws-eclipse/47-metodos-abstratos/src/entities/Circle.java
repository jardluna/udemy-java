package entities;

import entities.enums.Color;

public class Circle extends Shape {

	//ATTRIBUTES
	private Double radius;
	
	//CONSTRUCTOR
	public Circle() {
		super();
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	//GETTER AND SETTER
	public Double getRadius() {
		return radius;
	}
	
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	//METHOD
	@Override
	public final double area() {
		return Math.PI * radius * radius;
	}
	
}


