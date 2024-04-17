import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		//n1 - 0101 1001: 89
		//n2 - 0011 1100: 60
		System.out.println(n1 & n2); //R - 0001 1000: 24 (&)
		System.out.println(n1 | n2); //R - 0111 1101: 125 (|)
		System.out.println(n1 ^ n2); //R - 0110 0101: 101 (^)
		*/
		
		int mask = 0b00100000; //32 bits
		int n = sc.nextInt();
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		sc.close();
	}
}
