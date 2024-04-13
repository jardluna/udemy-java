import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Que horas são? ");
		int hora = sc.nextInt();
		
		if (hora >= 6 && hora <= 11) {
			System.out.println("Bom dia");
		} else if (hora >= 12 && hora <= 18) {
			System.out.println("Boa tarde");
		} else if (hora >= 19){
			System.out.println("Boa noite");
		}
		
		sc.close();
	}

}
