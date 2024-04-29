/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como
as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas 
informações deve ser armazenada em um vetor. Depois, imprimir os 
nomes dos alunos aprovados, considerando aprovados aqueles cuja 
média das notas seja maior ou igual a 6.0 (seis).
 */
package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos seráo digitados? ");
		int n = sc.nextInt();
		System.out.println();
		
		String[] vectName = new String[n];
		double[] vectGrade1 = new double[n];
		double[] vectGrade2 = new double[n];
		double[] vectMedia = new double[n];
		int cont = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite o nome, a primeira e %na segunda nota do %d aluno: %n", i + 1);   
			sc.nextLine();
			String name = sc.nextLine();
			vectName[i] = name;
			double grade1 = sc.nextDouble();
			vectGrade1[i] = grade1;
			double grade2 = sc.nextDouble();
			vectGrade2[i] = grade2;
			vectMedia[i] = (vectGrade1[i] + vectGrade2[i]) / 2;
			System.out.println();
		}
		System.out.println();
		
		System.out.println("ALUNOS APROVADOS: ");
		for(int i = 0; i < n; i++) {
			if(vectMedia[i] >= 6) {
				System.out.println(vectName[i].toUpperCase());
				cont += 1;
			}
		}
		
		if(cont < 1) {
			System.out.println("NENHUM ALUNO APROVADO");
		}
		
		sc.close();
	}

}
