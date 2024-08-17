package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("-- Entre com os dados do aluguel --");
		System.out.print("Modelo do carro: ");
		String model = sc.nextLine();
		System.out.print("Retirada (dd/mm/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.print("Retorno (dd/mm/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
		
		CarRental carRental = new CarRental(start, finish, new Vehicle(model));
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		rentalService.processInvoice(carRental);
		
		System.out.println();
		System.out.println("FATURA:");
		System.out.println("Pagamento basico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().TotalPayment()));
		
		sc.close();
	}

}
