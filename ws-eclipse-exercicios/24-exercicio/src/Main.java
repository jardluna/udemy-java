import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Exercício 7 sobre estrutura repetitiva for
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			double p2 = Math.pow(i, 2);
			double p3 = Math.pow(i, 3);
			System.out.print("[" + i + "]");
			System.out.printf("[%.0f]", p2);
			System.out.printf("[%.0f] %n", p3);
		}
		
		sc.close();
	}
}
