package application;

import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//VARIÁVEL REFERÊNCIA - Declarado em Classes
		Product p; 
		p = new Product("TV", 900.00, 1);
		System.out.println(p);
		
		//VARIÁVEL VALOR - Declarado em tipos Primitivos
		String name = "TV";
		double price = 900.00;
		int quantity = 1;
		System.out.println(name + " / " + String.format("%.2f", price) + " / " + quantity);
		
	}

}
