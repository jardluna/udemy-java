/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) 
e depois N números inteiros e armazene-os em um vetor. 
Em seguida, mostrar na tela todos os números negativos lidos.
 */

package application;

import java.util.Scanner;
import entities.Negative;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão digitados: ");
		int n = sc.nextInt();
		System.out.println();
		
		if(n > 10) {
			do {
				System.out.println("* DIGITE UM NÚMERO IGUAL OU MENOR QUE 10 *");
				System.out.print("Quantos números serão digitados: ");
				n = sc.nextInt();
				System.out.println();
			} while(n > 10);
		}
		
		Negative[] vectClass = new Negative[n];
		int[] vectPrimitive = new int[n];
		
		for(int i = 0; i < vectClass.length; i++) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			vectClass[i] = new Negative(num);
			vectPrimitive[i] = num;
		}
		System.out.println();
		
		System.out.println("Números negativos: ");
		for(int i = 0; i < vectClass.length; i++) {
			if(vectPrimitive[i] < 0) {
				System.out.printf("%d %n", vectPrimitive[i]);
			}
		}
		
		sc.close();
	}

}
