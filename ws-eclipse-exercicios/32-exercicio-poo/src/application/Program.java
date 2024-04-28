/*
Faça um programa que leia N números reais e armazene-os em um vetor. 
Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor 

 */
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Soma;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão digitados: ");
		int n = sc.nextInt();
		
		Soma[] vectClass = new Soma[n];
		double[] vectPrimitive = new double[n];
		double soma = 0.0;
		
		System.out.println();
		for(int i = 0; i < vectClass.length; i++) {
			System.out.print("Digite um número: ");
			double num = sc.nextDouble();
			vectClass[i] = new Soma(num);
			vectPrimitive[i] = num;
			soma += vectPrimitive[i];
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		for(int i = 0; i < vectClass.length; i++) {
			System.out.print(vectClass[i].getNum() + "  ");
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f %n", soma);
		
		double media = soma / vectClass.length;
		System.out.printf("MÉDIA = %.2f %n", media);
		
		sc.close();
	}

}
