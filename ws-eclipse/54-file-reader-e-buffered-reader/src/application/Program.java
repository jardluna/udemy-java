package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
			
		String path = "C:\\Users\\mathe\\Material dos Cursos\\teste-de-file.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
