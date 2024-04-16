import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Exercício 5 sobre estrutura repetitiva for
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fat = 1;
		
		for (int i = 1; i <= n; i++) {
			fat *= i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}

}
