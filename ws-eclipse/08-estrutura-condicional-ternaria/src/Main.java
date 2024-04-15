import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
//Se o preço for maior que 20, o desconto é de 10%, senão é de 5%.
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double precoIni = sc.nextDouble(); //Preço inicial
		double desconto; //Desconto
		double precoFin; //Preço final
		String descontoPor; //Desconto em porcentagem
		//Operador IF ELSE
		/*if(precoIni > 20) {
			desconto = precoIni * 0.1;
			precoFin = precoIni - desconto;
			descontoPor = "10%";
		}
		else {
			desconto = precoIni * 0.05;
			precoFin = precoIni - desconto;
			descontoPor = "5%";
		}*/
		
		//Operador TERNÁRIO
		desconto = (precoIni > 20) ? precoIni * 0.1 : precoIni * 0.05;
		precoFin = precoIni - desconto;
		descontoPor = (precoIni > 20) ? "10%" : "5%";
		
		System.out.printf("Preço inicial: R$%.2f %n", precoIni);
		System.out.printf("Desconto: R$%.2f (%s) %n", desconto, descontoPor);
		System.out.printf("Preco final: R$%.2f %n", precoFin);
		
		sc.close();
	}

}
