import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //Padrão de pontuação US (ponto invés de virgula)
		Scanner sc = new Scanner(System.in);
		
		/*
		//Entrada de dados com String
		String x;
		System.out.print("Qual o seu nome? ");
		x = sc.next();
		System.out.printf("O seu nome é %s %n", x);
		*/
		
		/*
		//Entrada de dados com int
		int x;
		x = sc.nextInt();
		System.out.printf("Você digitou: %d %n", x);
		*/
		
		/*
		//Entrada de dados com double
		double x;
		x = sc.nextDouble();
		System.out.printf("Você digitou: %.2f %n" + x);
		*/
		
		/*
		//Entrada de dados com char
		char x;
		x = sc.next().charAt(0);
		System.out.printf("Você digitou: %c %n", x);
		*/
		
		/*
		//Entrada de dados com multiplos valores
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados inseridos: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		*/
		
		//Entrada de dados com quebra de linha
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine(); //Adicione um nextLine() vazio antes do nextLine() que irá ser utilizado.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
