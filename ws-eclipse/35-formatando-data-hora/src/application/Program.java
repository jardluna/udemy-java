package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		//REFERÊNCIA: https://docs.oracle.com/en%2Fjava%2Fjavase%2F17%2Fdocs%2Fapi%2F%2F/java.base/java/time/format/DateTimeFormatter.html
		
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d04 = Instant.now();
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		//DATA LOCAL - d01
		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d01 = " + fmt1.format(d01));
		System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("----------------------------");
		
		//DATA-HORA LOCAL - d02
		System.out.println("d02 = " + d02.format(fmt2));
		System.out.println("d02 = " + fmt2.format(d02));
		System.out.println("d02 = " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		System.out.println("d02 = " + d02.format(fmt4));
		System.out.println("----------------------------");
		
		//DATA-HORA GLOBAL (PARSE) - d03
		System.out.println("d03 = " + fmt3.format(d03));
		System.out.println("d03 = " + fmt5.format(d03));
		System.out.println("d03 = " + d03.toString()); //to.String DEIXA NO PADRÃO ISO 8601
		System.out.println("----------------------------");
		
		//DATA-HORA GLOBAL (NOW) - d04
		System.out.println("d04 = " + fmt3.format(d04));
		
	}
	
}


