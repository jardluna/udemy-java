package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		
		System.out.println("Studant Name: ");
		std.name = sc.nextLine();
		System.out.println();
		System.out.println("Student Grade: ");
		std.note1 = sc.nextDouble();
		std.note2 = sc.nextDouble();
		std.note3 = sc.nextDouble();
		System.out.println();
		
		System.out.printf("FINAL GRADE =  %.2f %n", std.finalGrade());
		if(std.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", std.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
