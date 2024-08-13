package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite alguma coisa:");
		String[] lines = new String[] {sc.nextLine()};
		String path = "C:\\Users\\mathe\\Material dos Cursos\\teste-de-writer.txt";
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bufferedWriter.write(line);
				bufferedWriter.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
