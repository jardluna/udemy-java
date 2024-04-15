import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a senha: ");
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Inválida");
			System.out.println("--------------------");
			System.out.print("Informe a senha: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
