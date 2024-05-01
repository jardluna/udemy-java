package application;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * BOXING - Conversão de um obejto tipo valor para 
		 * um objeto tipo referência compatível.
		 */
		int x = 20;
		Object obj = x;
		System.out.println("Boxing: " + obj);
		
		/*
		 * UNBOXING - Conversão de um obejto tipo referência para 
		 * um objeto tipo valor compatível.
		 */
		int y = (int) obj;
		System.out.println("Unboxing: " + y);
		
		/*
		 * WRAPPER CLASSES - São classes equivalentes 
		 * aos tipos primitivos, onde não há o uso de casting.	
		 */
		x = 20;
		Integer objInt = x;
		y = objInt;
		System.out.println("Wrapper Class: " + y);
	}

}


