import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
/*
 * Leia 2 valores inteiros (A e B). Após, o programa deve 
 * mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
 * indicando se os valores lidos são múltiplos entre si.
 * Atenção: os números devem poder ser digitados em ordem 
 * crescente ou decrescente.
 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int A = sc.nextInt();
		System.out.print("Digite um número: ");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Os números digitados SÃO MULTIPLOS");
		} else {
			System.out.println("Os números digitados NÃO SÃO MULTIPLOS");
		}
		
		sc.close();
	}

}
