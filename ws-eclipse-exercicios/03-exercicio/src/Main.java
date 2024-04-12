
public class Main {

	public static void main(String[] args) {
		
		int a1 = 5;
		int b1 = 6;
		int c1 = 7;
		int d1 = 8;
		int a2 = 5;
		int b2 = 6;
		int c2 = -7;
		int d2 = 8;
		int dif1, dif2;
		dif1 = a1 * b1 - c1 * d1;
		dif2 = a2 * b2 - c2 * d2;
		
		System.out.printf("A diferença entre (%d * %d - %d * %d) é: %d %n", a1, b1, c1, d1, dif1);
		System.out.printf("A diferença entre (%d * %d - %d * %d) é: %d %n", a2, b2, c2, d2, dif2);
	}

}
