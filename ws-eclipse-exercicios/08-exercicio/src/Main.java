import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro
		 * e dizer se este número é par ou ímpar.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Esse número é PAR");
		} else {
			System.out.println("Esse número é IMPAR");
		}
	}

}
