package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		
		System.out.println("----------- HIGH SCHOOL -----------");
		System.out.println("Student Name: ");
		std.name = sc.nextLine();
		System.out.println("Student Grades: ");
		std.grade1 = sc.nextDouble();
		std.grade2 = sc.nextDouble();
		std.grade3 = sc.nextDouble();
		std.grade4 = sc.nextDouble();
		
		System.out.println();
		System.out.println("------------- RESULT -------------");
		
		if(std.checker() == true) {
			if(std.finalGrade() < 60) {
				System.out.println(std);
				System.out.println();
				System.out.printf("YOU FAILED - Missing Points: %.2f", std.missingPoints());
			}
			else {
				System.out.println(std);
				System.out.println();
				System.out.println("YOU PASS - CONGRATULATIONS	");
			}
		}
		else {
			System.out.printf("Invalid values.%nAll scores must be below 100");
		}
		
		sc.close();
	}
}



