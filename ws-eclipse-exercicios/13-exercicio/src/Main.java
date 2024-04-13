import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		double x = sc.nextDouble();
		System.out.print("Digite o valor de Y: ");
		double y = sc.nextDouble();
		double Q1, Q2, Q3, Q4;
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if ((x == 0 && y > 0) || (x == 0 && y < 0)) {
			System.out.println("Eixo X");
		} else if ((x > 0 && y == 0) || (x < 0 && y == 0)) {
			System.out.println("Eixo Y");
		} else if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		
		
		
	}

}
