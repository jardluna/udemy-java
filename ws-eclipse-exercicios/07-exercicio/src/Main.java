import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro,
		 * e depois dizer se este número é negativo ou não
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("Esse número é NEGATIVO");
		} else {
			System.out.println("Esse número é POSITIVO");
		}
		sc.close();
	}

}
