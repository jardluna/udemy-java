package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\mathe\\Material dos Cursos\\teste-de-bloco-finally.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch(FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
			e.printStackTrace();
		}
		finally {
			if(sc != null) {
				sc.close();
				System.out.println();
				System.out.println("The scanner closed!");
			} else {
				System.out.println();
				System.out.println("The scanner not closed...");
			}
		}
	}
}


