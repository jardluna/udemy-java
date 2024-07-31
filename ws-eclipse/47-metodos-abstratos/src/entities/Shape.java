package entities;

import entities.enums.Color;

public abstract class Shape {

	//ATTRIBUTES
	private Color color;
	
	//CONSTRUCTOR
	public Shape() {
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	//GETTER AND SETTER
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	//METHOD
	public abstract double area();
	
}


