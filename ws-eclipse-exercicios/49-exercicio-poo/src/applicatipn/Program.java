package applicatipn;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("---- Tax payer #" + i + " data ----");
			System.out.print("Individual or company (i/c): ");
			char indOrComp = sc.next().charAt(0);
			if(indOrComp == 'i' || indOrComp == 'I' || indOrComp == 'c' || indOrComp == 'C') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				if(indOrComp == 'i' || indOrComp == 'I') {
					System.out.print("Health expenditures: ");
					double healthExpenditure = sc.nextDouble();
					System.out.println();
					list.add(new Individual(name, anualIncome, healthExpenditure));
				} else if(indOrComp == 'c' || indOrComp == 'C') {
					System.out.print("Number of employees: ");
					int numberOfEmployee = sc.nextInt();
					System.out.println();
					list.add(new Company(name, anualIncome, numberOfEmployee));
				}
			} else {
				do {
					System.out.println();
					System.out.println("OPCION INVALID. TRY AGAIN");
					System.out.print("Individual or company (i/c): ");
					indOrComp = sc.next().charAt(0);
				} while(indOrComp != 'i' && indOrComp != 'I' && indOrComp != 'c' && indOrComp != 'C');
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				if(indOrComp == 'i' || indOrComp == 'I') {
					System.out.print("Health expenditures: ");
					double healthExpenditure = sc.nextDouble();
					System.out.println();
					list.add(new Individual(name, anualIncome, healthExpenditure));
				} else if(indOrComp == 'c' || indOrComp == 'C') {
					System.out.print("Number of employees: ");
					int numberOfEmployee = sc.nextInt();
					System.out.println();
					list.add(new Company(name, anualIncome, numberOfEmployee));
				}
			}
		}
		System.out.println();
		
		//LIST OF TAXES PAID
		System.out.println("TAXES PAID: ");
		for(TaxPayer taxesPaid : list) {
			if(taxesPaid instanceof Individual) {
				System.out.println(taxesPaid.getName() + ": $" + String.format("%.2f", taxesPaid.tax()) + " - [Individual]");
			} else {
				System.out.println(taxesPaid.getName() + ": $" + String.format("%.2f", taxesPaid.tax()) + " - [Company]");
			}
		}
		System.out.println();
		
		//TOTAL SUM OF TAXES
		double sumOfTaxes = 0.0;
		for(TaxPayer taxesPaid : list) {
			sumOfTaxes += taxesPaid.tax();
		}
		System.out.printf("TOTAL TAXES: $%.2f", sumOfTaxes);
		
		sc.close();
	}
}


