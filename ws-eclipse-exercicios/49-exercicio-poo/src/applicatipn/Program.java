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
		List<TaxPayer> taxPayer = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("-- Tax payer #" + i + " data --");
			System.out.print("Individual or company (i/c): ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if(ch == 'i' || ch == 'I') {
				System.out.print("Health expenditures: ");
				double healthExpenditure = sc.nextDouble();
				taxPayer.add(new Individual(name, anualIncome, healthExpenditure));
			} else if(ch == 'c' || ch == 'C') {
				System.out.print("Number of employees: ");
				int numberOfEmployee = sc.nextInt();
				taxPayer.add(new Company(name, anualIncome, numberOfEmployee));
			}
		}
		System.out.println();
		
		System.out.println("TAXES PAID: ");
		for(TaxPayer tp : taxPayer) {
			System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax()));
		}
		System.out.println();
		
		double sum = 0.0;
		for(TaxPayer tp : taxPayer) {
			sum += tp.tax();
		}
		System.out.printf("TOTAL TAXES: $%.2f", sum);
		
		
		sc.close();
	}
}


