package entities;

public class CurrencyConverter {
	
	public static double dollarPrice;
	public static double dollarBought;
	
	public static double dollarConverted() {
		return dollarBought * dollarPrice + dollarBought * dollarPrice * 0.06;
	}
	
}
