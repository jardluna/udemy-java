package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path:");
		File path = new File(sc.nextLine());
		
		System.out.println();
		File[] folders = path.listFiles(File::isDirectory);// EXIBE AS PASTAS DO CAMINHO ESPECIFICADO
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		File[] files = path.listFiles(File::isFile);// EXIBE OS ARQUIVOS DO CAMINHO ESPECIFICADO
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		System.out.println();
		boolean sub = new File(path + "\\teste-sub-pasta").mkdir();// CRIA UMA SUBPASTA NO CAMINHO ESPECIFICADO
		System.out.println("Directory created sucessfully: " + sub);
		
		sc.close();
	}

}
