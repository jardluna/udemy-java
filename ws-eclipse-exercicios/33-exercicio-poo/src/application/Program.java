/*
Fazer um programa para ler nome, idade e altura de N pessoas, 
conforme exemplo. Depois, mostrar na tela a altura média das pessoas, 
e mostrar também a porcentagem de pessoas com menos de 16 anos, 
bem como os nomes dessas pessoas caso houver. 
 */

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Alturas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		System.out.println();
		
		Alturas[] vectC = new Alturas[n]; //VETOR DE REFERENCIA
		//double[] vectP = new double[n]; //VETOR DE VALOR
		double soma = 0.0;
		double menor = 0.0;
		double alturaMedia = 0.0;
		double menorMedia = 0.0;
		
		for(int i = 0; i < vectC.length; i++) {
			int c = i + 1;
			System.out.printf("Dados da %dª pessoa %n", c);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			System.out.println();
			vectC[i] = new Alturas(nome, idade, altura);
			soma += vectC[i].getAltura();
			if(vectC[i].getIdade() < 16) {
				menor += 1;
			}
		}
		
		alturaMedia = soma / vectC.length;
		menorMedia = 100 / vectC.length * menor;
		
		System.out.printf("Altura Média: %.2f %n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f", menorMedia);
		System.out.println("%");
		
		for(int i = 0; i < vectC.length; i++) {
			if(vectC[i].getIdade() < 16) {
				System.out.println(vectC[i].getNome().toUpperCase());
			}
		}
		
		sc.close();
	}

}


