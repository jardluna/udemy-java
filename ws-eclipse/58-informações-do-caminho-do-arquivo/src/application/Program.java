package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		File path = new File(sc.nextLine());
		
		System.out.println();
		System.out.println("getName: " + path.getName()); // EXIBE APENAS O NOME DO ARQUIVO
		System.out.println("getParent: " + path.getParent()); //EXIBE APENAS O CAMINHO DO ARQUIVO
		System.out.println("getPath: " + path.getPath()); //EXIBE O NOME E O CAMINHO DO ARQUIVO
		
		sc.close();

	}

}
