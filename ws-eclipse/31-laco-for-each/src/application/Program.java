package application;

public class Program {

	public static void main(String[] args) {

		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		//FOR PADRÃO
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("--------------");
		
		//FOR EACH
		for(String obj : vect) {
			System.out.println(obj);
		}
	}

}
