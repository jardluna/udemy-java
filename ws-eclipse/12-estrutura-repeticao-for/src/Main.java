import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade: ");
		int n = sc.nextInt();
		int s = 0;
		
		for(int v = 0; v < n; v++) {
			int m = sc.nextInt();
			s += m;
		}
		System.out.println("Soma dos valores: " + s);
		sc.close();*/
		
		System.out.println("Ordem Crescente");
		for (int i1 = 0; i1 < 5; i1++) {
			System.out.println("Valor de i: " + i1);
		}
		
		System.out.println("");
		
		System.out.println("Ordem Decrescente");
		for (int i2 = 4; i2 >= 0; i2--) {
			System.out.println("Valor de i: " + i2);
		}
	}

}
