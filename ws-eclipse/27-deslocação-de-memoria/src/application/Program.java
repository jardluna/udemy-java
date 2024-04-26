package application;

import java.util.Locale;

public class Program {
	
	//ATRIBUTOS DA CLASSE
	private String name;
	private double price;
	private int quantity;
	
	//PROGRAMA PRINCIPAL
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Program p = new Program();
		p = method();
		System.out.println(p.name);
		System.out.printf("%.2f %n", p.price);
		System.out.println(p.quantity);
		System.out.println(p);
	}
	
	//MÉTODO 
	public static Program method() {
		Program p = new Program("TV", 910.00, 0);
		return p;
	}
	
	//CONSTRUTOR
	public Program() {
		
	}
	
	public Program(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//FORMATAÇÃO
	public String toString() {
		return name + " / " 
				+ String.format("%.2f", price) + " / " 
				+ quantity;
	}

}
