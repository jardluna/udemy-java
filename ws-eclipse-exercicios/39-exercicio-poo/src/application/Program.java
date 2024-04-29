/*
Fazer um programa para ler um conjunto de nomes de pessoas e 
suas respectivas idades. Os nomes devem ser armazenados em um vetor, 
e as idades em um outro vetor. Depois, mostrar na tela o nome 
da pessoa mais velha. 
 */

package application;

import java.util.Scanner;
import entities.Idade;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		System.out.println();
		
		Idade[] vectNameC = new Idade[n];
		String[] vectNameP = new String[n];
		Idade[] vectAgeC = new Idade[n];
		int[] vectAgeP = new int[n];
		int maiorIdade = 0;
		int maiorPosi = 0;
		
		for(int i = 0; i < vectAgeC.length; i++) {
			System.out.printf("Dados da %dº pessoa: %n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			vectNameC[i] = new Idade(name);
			vectNameP[i] = name;
			vectAgeC[i] = new Idade(age);
			vectAgeP[i] = age;
		}
		System.out.println();
		
		maiorIdade = vectAgeP[0];
		for(int i = 1; i < vectAgeP.length; i++) {
			if(vectAgeP[i] > maiorIdade) {
				maiorIdade = vectAgeP[i];
				maiorPosi = i;
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + vectNameP[maiorPosi].toUpperCase());
		
		sc.close();
	}

}


