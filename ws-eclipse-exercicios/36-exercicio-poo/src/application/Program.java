/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. 
Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma 
dos elementos correspondentes de A e B. Imprima o vetor C gerado.
 */

package application;

import java.util.Scanner;
import entities.Soma_vectA;
import entities.Soma_vectB;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores terão cada vetor: ");
		int n = sc.nextInt();
		System.out.println();
		
		Soma_vectA[] vectClassA = new Soma_vectA[n]; //VETOR DE REFERENCIA
		Soma_vectB[] vectClassB = new Soma_vectB[n]; //VETOR DE REFERENCIA
		int[] vectPrimitiveA = new int[n]; //VETOR DE VALOR
		int[] vectPrimitiveB = new int[n]; //VETOR DE VALOR
		int[] vectC = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < vectClassA.length; i++) {
			int numA = sc.nextInt();
			vectClassA[i] = new Soma_vectA(numA);
			vectPrimitiveA[i] = numA;
		}
		System.out.println();
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i < vectClassB.length; i++) {
			int numB = sc.nextInt();
			vectClassB[i] = new Soma_vectB(numB);
			vectPrimitiveB[i] = numB;
		}
		System.out.println();
		
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0; i < vectC.length; i++) {
			vectC[i] = vectPrimitiveA[i] + vectPrimitiveB[i];
			System.out.println(vectC[i]);
		}
		
		sc.close();
	}

}


