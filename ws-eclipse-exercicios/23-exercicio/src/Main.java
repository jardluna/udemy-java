import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Exercício 6 sobre estrutura repetitiva for
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 || n % i == n) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
