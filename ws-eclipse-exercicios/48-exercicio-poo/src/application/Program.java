package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of product: ");
		int quantP = sc.nextInt(); //quantP = QUANTITY PRODUCT
		System.out.println();
		
		for(int c = 1; c <= quantP; c++) {
			System.out.println("--- Product #" + c + " data ---");
			System.out.print("Common, used or imported (c/u/i): ");
			char prodTp = sc.next().charAt(0); //prodTp == PRODUCT TYPE
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(prodTp == 'c' || prodTp == 'C') {
				list.add(new Product(name, price));
			} else if(prodTp == 'u' || prodTp == 'U') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			} else if(prodTp == 'i' || prodTp == 'I') {
				System.out.print("Custom fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
		}
		System.out.println();
		
		System.out.println("PRICE TAGS");
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}
}


