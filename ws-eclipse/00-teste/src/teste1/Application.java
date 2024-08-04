package teste1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] vect = sc.next().split(" ", 3);
		
		for(String c : vect) {
			System.out.println(c);
		}
		
		sc.close();
	}

}
