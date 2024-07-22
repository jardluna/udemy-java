package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("-- Enter cliente data --");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String date = sc.nextLine();
		LocalDate birthDate = LocalDate.parse(date, dtf);
		Client client = new Client(name, email, birthDate);
		System.out.println();
	
		System.out.println("-- Enter order data --");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		Order order = new Order(LocalDateTime.now(), status, client);
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for(int c = 1; c <= n; c++) {
			System.out.println("-- Enter #" + c + " item data --");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			order.addItem(orderItem);
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		System.out.println("-- Order summary --");
		System.out.println(order);

		sc.close();
	}
}
