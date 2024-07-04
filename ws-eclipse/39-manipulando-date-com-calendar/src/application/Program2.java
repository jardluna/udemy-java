package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program2 {

	public static void main(String[] args) {
		/*
		 * DATE E CALENDAR É O MODELO ANTIGO DE DATA-HORA USADO PELO JAVA ANTES DA VERSÃO 8.
		 * ESSE MODELO ANTIGO AINDA É USADO EM ALGUNS SISTEMAS LEGADOS DE JAVA.
		 */
		//OBTENDO UMA UNIDADE DE TEMPO
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		System.out.println("-------------------");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

	}

}
