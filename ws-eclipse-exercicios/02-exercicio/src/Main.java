import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double raio1 = 2.00;
		double raio2 = 100.64;
		double raio3 = 150.00;
		double pi = 3.14159;
		double area1, area2, area3;
		area1 = pi * Math.pow(raio1, 2); //CÁLCULO DE POTENCIAÇÃO
		area2 = pi * Math.pow(raio2, 2); //CÁLCULO DE POTENCIAÇÃO
		area3 = pi * Math.pow(raio3, 2); //CÁLCULO DE POTENCIAÇÃO
		
		System.out.printf("Area 1 = %.4f %n", area1);
		System.out.printf("Area 2 = %.4f %n", area2);
		System.out.printf("Area 3 = %.4f %n", area3);
	}

}
