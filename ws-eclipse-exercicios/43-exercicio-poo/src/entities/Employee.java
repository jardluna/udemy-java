package entities;

public class Employee {

	//ATTRIBUTES
	private Integer id;
	private String name;
	private String sobrenome;
	private Double salary;
	
	//CONSTRUCTOR
	public Employee() {
		
	}
	
	public Employee(Integer id, String name, String sobrenome, Double salary) {
		this.id = id;
		this.name = name;
		this.sobrenome = sobrenome;
		this.salary = salary;
	}
	
	//GETTER AND SETTER
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	//METHOD
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100;
	}
	
	//FORMAT
	public String toString() {
		return id +
				", " +
				name.toUpperCase().charAt(0) + name.substring(1) +
				" " +
				sobrenome.toUpperCase().charAt(0) + sobrenome.substring(1) +
				", " +
				String.format("%.2f", salary);
	}
}


