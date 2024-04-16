import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		char r;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = 9 * c / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f %n", f);
			System.out.print("Deseja continuar (s/n)? ");
			r = sc.next().charAt(0);
		} while (r == 's');
		System.out.println("VOLTE SEMPRE!");
		
		sc.close();
	}
}
