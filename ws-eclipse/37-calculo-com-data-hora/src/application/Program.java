package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.parse("2022-07-20");
		LocalDateTime d2 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d3 = Instant.parse("2022-07-20T01:30:26Z");
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		
		System.out.println();//QUEBRA DE LINHA
		
		LocalDate pastDaysLocalDate = d1.minusDays(7);
		LocalDate nextDaysLocalDate = d1.plusDays(7);
		LocalDate nextYearsLocalDate = d1.plusYears(7);
		
		System.out.println("Past Days = " + pastDaysLocalDate);
		System.out.println("Next Days = " + nextDaysLocalDate);
		System.out.println("Next Years = " + nextYearsLocalDate);
		
		System.out.println();//QUEBRA DE LINHA
		
		LocalDateTime pastDaysLocalDateTime = d2.minusDays(7);
		LocalDateTime nextDaysLocalDateTime = d2.plusDays(7);
		LocalDateTime nextYearsLocalDateTime = d2.plusYears(7);
		
		System.out.println("Past Days = " + pastDaysLocalDateTime);
		System.out.println("Next Days = " + nextDaysLocalDateTime);
		System.out.println("Next Years = " + nextYearsLocalDateTime);
		
		System.out.println();//QUEBRA DE LINHA
		
		Instant pastDaysInstant = d3.minus(7, ChronoUnit.DAYS);
		Instant nextDaysInstant = d3.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Past Days = " + pastDaysInstant);
		System.out.println("Next week = " + nextDaysInstant);
		
		System.out.println();//QUEBRA DE LINHA
		
		Duration t1 = Duration.between(d1.atStartOfDay(), nextDaysLocalDate.atStartOfDay());//.atStartOfDay - CONVERTE LocalDate EM LocalDateTime
		Duration t2 = Duration.between(d2, nextDaysLocalDateTime);
		Duration t3 = Duration.between(pastDaysInstant, d3);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " +  t2.toDays());
		System.out.println("t3 minutos = " + t3.toMinutes());
		
	}
}


