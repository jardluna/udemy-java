package entities;

public class Student {
	
	public String name;
	public double grade1, grade2, grade3, grade4;
	
	public boolean checker() {
		if (grade1 > 100 || grade2 > 100 || grade3 > 100 || grade4 > 100) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public double finalGrade() {
		return (grade1 + grade2 + grade3 + grade4) / 4;
	}
	
	public double missingPoints() {
		if(finalGrade() < 60) {
			return 60 - finalGrade();
		}
		else {
			return 0.0;
		}
	}
	
	public String toString() {
		return name.toUpperCase()
				+ String.format(",%nyour AVERAGE FINAL is: ")
				+ String.format("%.2f", finalGrade());
	}
}

