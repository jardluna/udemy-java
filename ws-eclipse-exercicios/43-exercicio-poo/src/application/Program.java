package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		Employee emp = new Employee();
		
		System.out.print("How many employee will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Employee #%d: %n", (i + 1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			if(hasId(list, id)) {
				System.out.println();
				while(hasId(list, id)) {
					System.out.print("**Id already taken. Try again: ");
					id = sc.nextInt();
				}
				System.out.println();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine(); 
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();	
			
			/*
			//Instanciando a classe e depois atribuindo o elemento da lista
			emp = new Employee(id, name, salary);
			list.add(emp);
			*/
			
			//Atribuindo o elemento da lista com a instanciação da classe inclusa
			list.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.printf("**Enter the employee Id that will have %nsalary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		//Método de classe auxiliar para checar se o Id existe
		if(pos == null) {
			System.out.println("**This is does not exist!");
		}
		else {
			System.out.print("**Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		
		/*
		//Método local, utilizando expressão lambda para chegar se o Id é existe
		emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("**This is does not exist!");
		}
		else {
			System.out.print("*Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		*/
		
		System.out.println();
		System.out.println("List of employee: ");
		for(Employee resp : list) {
			System.out.println(resp);
		}
		
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			} 
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
		/*
		 * emp != null -> true
		 * emp == null -> false
		 */
	}

}


