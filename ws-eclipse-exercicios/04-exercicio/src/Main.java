import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String num1 = "25"; //NÚMERO DO FUNCIONÁRIO
		String num2 = "1";
		String num3 = "6";
		int hora1 = 100; //HORAS TRABALHADAS DO FUNCIONÁRIO
		int hora2 = 200;
		int hora3 = 145;
		double salH1 = 5.50; //SALÁRIO POR HORA DO FUNCIONÁRIO
		double salH2 = 20.50;
		double salH3 = 15.55;
		double salF1, salF2, salF3; //SALÁRIO FINAL DO FUNCIONÁRIO
		salF1 = hora1 * salH1;
		salF2 = hora2 * salH2;
		salF3 = hora3 * salH3;
		
		System.out.printf("Number: %s %n", num1);
		System.out.printf("Salary: U$ %.2f %n", salF1);
		System.out.println("------------------------");
		System.out.printf("Number: %s %n", num2);
		System.out.printf("Salary: U$ %.2f %n", salF2);
		System.out.println("------------------------");
		System.out.printf("Number: %s %n", num3);
		System.out.printf("Salary: U$ %.2f %n", salF3);
	}

}
