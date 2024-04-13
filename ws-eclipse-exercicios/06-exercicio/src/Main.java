import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		System.out.print("Insira o 1º valor: ");
		A = sc.nextDouble();
		System.out.print("Insira o 2º valor: ");
		B = sc.nextDouble();
		System.out.print("Insira o 3º valor: ");
		C = sc.nextDouble();
		triangulo = A * C / 2;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.println();
		System.out.printf("Triangulo: %.3f %n", triangulo);
		System.out.printf("Circulo: %.3f %n", circulo);
		System.out.printf("Trapezio: %.3f %n", trapezio);
		System.out.printf("Quadrado: %.3f %n", quadrado);
		System.out.printf("Retangulo: %.3f %n", retangulo);
		sc.close();
		
	}

}
