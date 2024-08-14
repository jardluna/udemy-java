package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		File sourcePath = new File(sc.nextLine()); // ENTRA COM O CAMINHO DO ARQUIVO
		System.out.println();
		
		String pathParent = sourcePath.getParent(); // EXIBE O CAMINHO ATÉ A PASTA DO ARQUIVO, SEM MOSTRA-LO
		boolean success = new File(pathParent + "\\out").mkdir(); // CRIA UMA SUBPASTA NA PASTA DO ARQUIVO
		
		String targetPath = pathParent + "\\out\\summary.csv"; // CRIA UM ARQUIVO NA SUBPASTA CRIADA ANTERIORMENTE
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {
			String itemCsv;
			while ((itemCsv = br.readLine()) != null) {
				String[] fields = itemCsv.split(",");
						
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity));
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetPath))) {
				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				System.out.println(targetPath + " - CREATED");
			}
			catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
	
}
