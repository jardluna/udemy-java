import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão lidos: ");
		int entrada = sc.nextInt();
		int in = 0;
		int out = 0;
		
		System.out.println("Digite-os:");
		for (int x = 0; x < entrada; x++) {
			int valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.println("-----------------------------");
		System.out.printf("%d in %n", in);
		System.out.printf("%d out %n", out);
		
		sc.close();
	}

}
