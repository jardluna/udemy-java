/*
Faça um programa que leia N números inteiros e armazene-os 
em um vetor. Em seguida, mostre na tela todos os números pares,
e também a quantidade de números pares. 
*/

package application;

import java.util.Scanner;
import entities.Pares;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão digitados: ");
		int n = sc.nextInt();
		System.out.println();
		
		Pares[] vect = new Pares[n]; //VETOR POR REFERENCIA
		int quantidade = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			vect[i] = new Pares(num);
		}
		System.out.println();
		
		System.out.println("NÚMEROS PARES: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getNum() % 2 == 0) {
				System.out.print(vect[i].getNum() + "  ");
				quantidade += 1;
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("QUANTIDADE DE PARES: " + quantidade);
		
		
		sc.close();
	}

}
