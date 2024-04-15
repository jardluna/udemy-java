import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- LISTA DE CÓDIGO ----");
		System.out.print("[1]Alcool ");
		System.out.println("[2]Gasolina");
		System.out.print("[3]Diesel ");
		System.out.println("[4]Sair");
		System.out.println("");
		
		System.out.print("Códido o produto: ");
		int codigo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while(codigo != 4) {
			if(codigo == 1) {
				alcool++;
			}
			else if (codigo == 2) {
				gasolina++;
			}
			else if (codigo == 3) {
				diesel++;
			}
			else if (codigo < 1 || codigo > 4) {
				System.out.println("[CÓDIGO INVÁLIDO]");
			}
			System.out.print("Códido o produto: ");
			codigo = sc.nextInt();
		}
		
		System.out.println("-------------------------");
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
