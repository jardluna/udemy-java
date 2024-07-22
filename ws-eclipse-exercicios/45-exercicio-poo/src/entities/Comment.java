package entities;

public class Comment {

	//ATTRIBUTES
	private String text;

	//CONSTRUCTOR
	public Comment() {
		
	}
	
	public Comment(String text) {
		this.text = text;
	}

	//GETTER AND SETTER
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}


