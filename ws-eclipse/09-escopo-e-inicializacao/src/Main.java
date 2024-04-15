
public class Main {

	public static void main(String[] args) {
		
		double x = 400.00;
		double price = x;
		double discount = 0;
		
		if(price < 200) {
			discount = price * 0.1;
		}
		
		System.out.println(price);
		System.out.println(discount);
	}

}
