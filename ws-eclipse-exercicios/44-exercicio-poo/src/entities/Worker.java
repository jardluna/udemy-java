package entities;

import java.util.ArrayList;
import java.util.List;
import entities.enums.WorkerLevel;

public class Worker {
	
	//ATTRIBUTES
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//ASSOCIATION
	private Department department;
	private List <HourContract> allContracts = new ArrayList<>();
	
	//CONSTRUCTOR
	public Worker() {
		
	}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	//GETTER AND SETTER
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public List<HourContract> getContracts() {
		return allContracts;
	}
	
	//METHOD
	public void addContract(HourContract contract) {
		allContracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		allContracts.remove(contract);
	}
	
	public double income(int month, int year) {
		double sum = baseSalary;
		for(HourContract c : allContracts) {
			int c_year = c.getDate().getYear();
			int c_month = c.getDate().getMonthValue();
			if (month == c_month && year == c_year) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	
	
}


