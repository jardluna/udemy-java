package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int l = 0; l < mat.length; l++) { //l = linha
			for(int c = 0; c < mat[l].length; c++) { //c = coluna
				mat[l][c] = sc.nextInt();
			}
		}
		System.out.println();
		
		System.out.println("Main diagonal: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		System.out.println("Negative numbers:");
		int contNeg = 0;
		for(int l = 0; l < mat.length; l++) { //l = linha
			for(int c = 0; c < mat[l].length; c++) { //c = coluna
				if(mat[l][c] < 0) {
					contNeg++;
				}
			}
		}
		System.out.println(contNeg);
		
		sc.close();
	}
}



