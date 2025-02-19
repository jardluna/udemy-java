package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("ENTRE COM OS DADOS DO CONTRATO");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/mm/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), dtf);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();

		Contract contract = new Contract (number, date, totalValue);
		
		System.out.print("Entre com o número de parcelas: ");
		int n = sc.nextInt();
		
		ContractService service = new ContractService(new PaypalService());
		service.processContract(contract, n);
		
		System.out.println();
		System.out.println("Parcelas:");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}
	
}
