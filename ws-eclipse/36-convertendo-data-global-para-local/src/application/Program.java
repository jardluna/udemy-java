package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.parse("2022-07-20");
		LocalDateTime d2 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d3 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d3, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d3, ZoneId.systemDefault());
		LocalDate r3 = LocalDate.ofInstant(d3, ZoneId.of("Portugal"));
		LocalDateTime r4 = LocalDateTime.ofInstant(d3, ZoneId.of("Portugal"));
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		System.out.printf("d4 = %s (dia) \n", d1.getDayOfMonth());
		System.out.printf("d5 = %s (mês) \n", d1.getMonthValue());
		System.out.printf("d6 = %s (ano) %n", d1.getYear());
		System.out.printf("d7 = %s (hora) %n", d2.getHour());
		System.out.printf("d8 = %s (minutos) %n", d2.getMinute());
		System.out.printf("d9 = %s (segundos) %n", d2.getSecond());
		
		System.out.println("---------------------------");
		
		System.out.println("r1 (Brasil) = " + r1);
		System.out.println("r2 (Brasil) = " + r2);
		System.out.println("r3 (Portugal) = " + r3);
		System.out.println("r4 (Portugal) = " + r4);
		
	}
}


