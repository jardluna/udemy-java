package entities;

public class ImportedProduct extends Product{

	//ATTRIBUTES
	private Double customsFee;

	//CONSTRUCTOR
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	//GETTER AND SETTER
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	//METHOD
	public double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(": $" + String.format("%.2f", totalPrice()));
		sb.append(" (Customs fee: $" + String.format("%.2f", customsFee) + ")");
		return sb.toString();
	}
}


