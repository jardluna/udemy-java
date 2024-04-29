/*
Fazer um programa para ler um número inteiro N e 
depois um vetor de N números reais. Em seguida, mostrar na tela 
a média aritmética de todos elementos com três casas decimais. 
Depois mostrar todos os elementos do vetor que estejam abaixo da média, 
com uma casa decimal cada. 
 */

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Media;

public class Program {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números terá o vetor? ");
		int n = sc.nextInt();
		System.out.println();
		
		Media[] vectC = new Media[n];
		double[] vectP = new double[n];
		double mediaVect = 0.0;
		
		for(int i = 0; i < vectC.length; i++) {
			System.out.print("Digite um número: ");
			double num = sc.nextDouble();
			vectC[i] = new Media(num);
			vectP[i] = num;
			mediaVect += vectP[i];
		}
		System.out.println();
		
		mediaVect /= n;
		System.out.printf("MEDIA DO VETOR = %.3f %n", mediaVect);
		System.out.println();
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i = 0; i < vectP.length; i++) {
			if(vectP[i] < mediaVect) {
				System.out.println(vectP[i]);
			}
		}
		
		sc.close();
	}
}


