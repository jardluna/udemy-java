package application;

import java.util.Scanner;

import entities.Test;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***** TESTE *****");
		System.out.println();
		
		System.out.print("Qual o valor da variavel: ");
		int num = sc.nextInt();
		Test ts = new Test(num + 5);
		System.out.println();
		
		
		System.out.println(ts.getNum());
		
		sc.close();
	}
}



