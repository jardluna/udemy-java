import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Exercício 3 sobre estrutura repetitiva for
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		
		for (int x = 0; x < n; x++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double media = (a * 2 + b * 3 + c * 5) / 10;
			System.out.printf("%.1f %n", media);
		}
		
		sc.close();
	}

}
