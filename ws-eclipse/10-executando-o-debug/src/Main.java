import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		
		System.out.print("Largura: ");
		double largura = sc.nextDouble();
		System.out.print("Comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.print("Valor metro²:");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = metroQuadrado * area;
		
		System.out.printf("Area: %.0fm %n", area);
		System.out.printf("Preço: R$%.2f %n", preco);
		
		sc.close();
	}

}
