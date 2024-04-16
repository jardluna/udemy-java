import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Exercício 1 sobre estrutura repetitiva for 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Começa no: ");
		int numI = sc.nextInt(); //Número em que começa a contagem
		System.out.print("Termina no: ");
		int numF = sc.nextInt(); //Número em que termina a contagem
		System.out.println("----------------------------");
		System.out.printf("Todos os IMPARES entre %d e %d %n",numI, numF);
		
		for (int contador = numI; contador <= numF; contador++) {
			if (contador % 2 == 1) {
				System.out.print("[" + contador + "]");
			}
		}
		
		sc.close();
	}

}
