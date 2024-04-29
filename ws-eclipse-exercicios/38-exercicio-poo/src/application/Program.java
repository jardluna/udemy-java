/*
Fazer um programa para ler um vetor de N números inteiros. 
Em seguida, mostrar na tela a média aritmética somente dos 
números pares lidos, com uma casa decimal. Se nenhum número par 
for digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */

package application;

import java.util.Scanner;
import entities.Media;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números terá o vetor? ");
		int n = sc.nextInt();
		System.out.println();
		
		Media[] vectC = new Media[n];
		double[] vectP = new double[n];
		double mediaPar = 0.0;
		int contPar = 0;
		
		for(int i = 0; i < vectC.length; i++) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			vectC[i] = new Media(num);
			vectP[i] = num;
			if(vectP[i] % 2 == 0) {
				mediaPar += vectP[i];
				contPar += 1;
			}
		}
		System.out.println();
		
		mediaPar /= contPar;
		if(contPar > 0) {
			System.out.printf("MEDIA DOS PARES: %.1f", mediaPar);
		}
		else {
			System.out.println("NENHUM NÚMERO PAR");
		}
		
		sc.close();
	}

}
