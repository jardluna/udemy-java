package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
	
	public static void main(String[] args) {
		
		//REFERÊNCIA:https://docs.oracle.com/en%2Fjava%2Fjavase%2F17%2Fdocs%2Fapi%2F%2F/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-04-07");
		LocalDateTime d05 = LocalDateTime.parse("2024-04-07T12:45:27");
		Instant d06 = Instant.parse("2024-04-07T12:45:27Z");
		Instant d07 = Instant.parse("2024-04-07T12:45:27-03:00");
		
		LocalDate d08 = LocalDate.parse("07/04/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("07/04/2024 12:35", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate d10 = LocalDate.of(2024, 04, 14);
		LocalDateTime d11 = LocalDateTime.of(2024, 11, 21, 13, 10);
		
		//DATA LOCAL - d01
		System.out.println("d01 = " + d01);
		
		//DATA-HORA LOCAL - d02
		System.out.println("d02 = " + d02);
		
		//DATA-HORA GLOBAL (GMT 0) - d03
		System.out.println("d03 = " + d03);
		
		//DATA LOCAL PADRÃO ISO 8601 - d04
		System.out.println("d04 = " + d04);
		
		//DATA-HORA LOCAL PADRÃO ISO 8604 - d05
		System.out.println("d05 = " + d05);
		
		//DATA-HORA GLOBAL (GMT 0) PADRÃO ISO 8601 - d06
		System.out.println("d06 = " + d06);
		
		//DATA-HORA GLOBAL (GMT -3) PADRÃO ISO 8601 - d07
		System.out.println("d07 = " + d07);
		
		//DATA LOCAL CUSTOMIZADO - d08
		System.out.println("d08 = " + d08);
		
		//DATA-HORA LOCAL CUSTOMIZADO - d09
		System.out.println("d09 = " + d09);
		
		//DATA LOCAL ISOLADA
		System.out.println("d10 = " + d10);
		
		//DATA-HORA ISOLADA
		System.out.println("d11 = " + d11);
	}

}


