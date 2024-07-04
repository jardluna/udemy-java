package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program1 {

	public static void main(String[] args) {
		/*
		 * DATE E CALENDAR É O MODELO ANTIGO DE DATA-HORA USADO PELO JAVA ANTES DA VERSÃO 8.
		 * ESSE MODELO ANTIGO AINDA É USADO EM ALGUNS SISTEMAS LEGADOS DE JAVA.
		 */
		//SOMANDO UNIDADES DE TEMPO
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		//HORA GMT/UTC
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		//HORA MODIFICADA (ADIÇÃO DE HORAS)
		System.out.println(sdf.format(d));
		
	}
	
}


