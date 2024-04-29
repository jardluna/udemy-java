package entities;

public class Idade {
	
	//ATTRIBUTES
	private String name;
	private int age;
	
	//CONSTRUCTOR
	public Idade() {
		
	}
	
	public Idade(String name) {
		this.name = name;
	}
	
	public Idade(int age) {
		this.age = age;
	}
	
	//GETTER AND SETTER
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}


