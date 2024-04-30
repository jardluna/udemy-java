package entities;

public class Rent {

	//ATTRIBUTES
	private String name;
	private String sobrenome;
	private String email;
	private int room;
	
	//CONSTRUCTOR
	public Rent() {
		
	}
	
	public Rent(String name, String sobrenome, String email, int room) {
		this.name = name;
		this.sobrenome = sobrenome;
		this.email = email;
		this.room = room;
	}
	
	public Rent(int room) {
		this.room = room;
	}
	
	//GETTER AND SETTER
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getRoom() {
		return room;
	}
	
	public void setRoom(int room) {
		this.room = room;
	}
	
	public String toString() {
		return name.toUpperCase().charAt(0) + name.substring(1)
				+ " "
				+ sobrenome.toUpperCase().charAt(0) + sobrenome.substring(1)
				+ ", "
				+ email;
	}
	
}


