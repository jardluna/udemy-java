/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. 
Fazer um programa que calcule e escreva a maior e a menor altura 
do grupo, a média de altura das mulheres, e o número de homens. 

 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		System.out.println();
		
		double[] vectAltura = new double[n];
		char[] vectGenero = new char[n];
		double menorAltura = 0.0;
		double maiorAltura = 0.0;
		double alturaMediaF = 0.0;
		int contadorF = 0;
		int contadorM = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Altura da %dª pessoa: ", i + 1);
			double altura = sc.nextDouble();
			vectAltura[i] = altura;
			System.out.printf("Genero da %dª pessoa: ", i + 1);
			char genero = sc.next().charAt(0);
			vectGenero[i] = genero;
			if(vectGenero[i] == 'f' || vectGenero[i] == 'F') {
				alturaMediaF += vectAltura[i];
				contadorF += 1;
			}
			else if(vectGenero[i] == 'm' || vectGenero[i] == 'M') {
				contadorM += 1;
			}
			System.out.println();
		}
		System.out.println();
		
		maiorAltura = vectAltura[0];
		menorAltura = vectAltura[0];
		alturaMediaF /= contadorF;
		
		for(int i = 1; i < n; i++) {
			if(vectAltura[i] > maiorAltura) {
				maiorAltura = vectAltura[i];
			}
			else if(vectAltura[i] < menorAltura){
				menorAltura = vectAltura[i];
			}
		}
		
		System.out.printf("MENOR ALTURA = %.2f %n", menorAltura);
		System.out.printf("MAIOR ALTURA = %.2f %n", maiorAltura);
		System.out.printf("ALTURA MÉDIA DAS MULHERES = %.2f %n", alturaMediaF);
		System.out.println("NÚMERO DE HOMENS = " + contadorM);
		
		sc.close();
	}

}


