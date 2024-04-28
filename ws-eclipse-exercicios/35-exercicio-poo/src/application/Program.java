/*
Faça um programa que leia N números reais e armazene-os em um 
vetor. Em seguida, mostrar na tela o maior número do vetor 
(supor não haver empates). Mostrar também a posição do 
maior elemento, considerando a primeira posição como 0 (zero).
 */

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Posicao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão digitados: ");
		int n = sc.nextInt();
		System.out.println();
		
		Posicao[] vectC = new Posicao[n];
		double[] vectP = new double[n];
		double maiorVal;
		int maiorPos;
		
		for(int i = 0; i < vectC.length; i++) {
			System.out.print("Digite um número: ");
			double num = sc.nextDouble();
			vectC[i] = new Posicao(num);
			vectP[i] = num;
		}
		System.out.println();

		maiorVal = vectP[0];
		maiorPos = 0;
		
		for(int i = 0; i < vectC.length; i++) {
			if(vectP[i] > maiorVal) {
				maiorVal = vectP[i];
				maiorPos = i;
			}
		}
		
		System.out.println("MAIOR VALOR: " + maiorVal);
		System.out.println("POSIÇÃO DO MAIOR VALOR: " + maiorPos);
		
		sc.close();
	}

}


