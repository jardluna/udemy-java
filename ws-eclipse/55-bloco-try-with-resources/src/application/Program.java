package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\mathe\\Material dos Cursos\\teste-de-file.txt";
	
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}
