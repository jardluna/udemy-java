package teste1;

import teste2.Entities;

public class Application {

	public static void main(String[] args) {
		
		Entities p1, p2;
		
		p1 = new Entities("TV", 900.00, 0);
		System.out.println(p1);
		
		p2 = null;
		System.out.println(p2);
		
		p2 = new Entities("PC", 1500.00, 1);
		System.out.println(p2);
		
		
	}

}
