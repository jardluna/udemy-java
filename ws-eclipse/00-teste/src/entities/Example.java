package entities;

public class Example {
	
	public static int contador = 0;
	
	public Example() {
		contador++;
	}
	
	@Override
	public String toString() {
		return "" + contador;
	}
	
}
