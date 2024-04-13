import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código do produto: ");
		int codigo = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		int quantidade = sc.nextInt();
		double total = 0;
		
		if (codigo == 1) {
			System.out.println("Você está levando Cachorro Quente");
			total = quantidade * 4.0;
		} else if (codigo == 2) {
			System.out.println("Você está levando X-Salada");
			total = quantidade * 4.5;
		} else if (codigo == 3) {
			System.out.println("Você está levando X-Bacon");
			total = quantidade * 5.0;
		} else if (codigo == 4) {
			System.out.println("Você está levando Torrada Simples");
			total = quantidade * 2.0;
		} else if (codigo == 5){
			System.out.println("Você está levando Refrigerante");
			total = quantidade * 1.5;
		} else {
			System.out.println("CÓDIGO INVÁLIDO");
		}
		
		System.out.printf("Valor total R$%.2f %n", total);
		sc.close();
	}

}
