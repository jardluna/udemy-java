import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Método de entrada de dados convencional
		int a1 = 10;
		int b1 = 30;
		int a2 = -30;
		int b2 = 10;
		int a3 = 0;
		int b3 = 0;
		int soma1 = a1 + b1;
		int soma2 = a2 + b2;
		int soma3 = a3 + b3;
		
		System.out.printf("Soma de %d + %d é: %d %n", a1, b1, soma1);
		System.out.printf("Soma de %d + %d é: %d %n", a2, b2, soma2);
		System.out.printf("Soma de %d + %d é: %d %n", a3, b3, soma3);
		
		//Método de entrada de dados com Scanner
		/*Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int soma1 = a1 + b1;
		System.out.printf("Soma de %d + %d é: %d %n", a1, b1, soma1);
		
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int soma2 = a2 + b2;
		System.out.printf("Soma de %d + %d é: %d %n", a2, b2, soma2);
		
		int a3 = sc.nextInt();
		int b3 = sc.nextInt();
		int soma3 = a3 + b3;
		System.out.printf("Soma de %d + %d é: %d %n", a3, b3, soma3);
		
		sc.close();*/
	}

}
