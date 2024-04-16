import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//Exercício 4 sobre estrutura repetitiva for
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			double soma;
			if (a != 0 && b == 0) {
				System.out.println("Divisão Impossível");
			}
			else {
				soma = a / b;
				System.out.printf("%.1f %n", soma);
			}
		}
		
		sc.close();
	}
}
