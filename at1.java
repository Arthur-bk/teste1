package aula7;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;


public class at1 {

	public static void main(String[] args) {
		
		DateFormat data = DateFormat.getDateInstance(DateFormat.FULL);
		Calendar hoje = Calendar.getInstance();
		
		Date data1= new Date();
		
		int horas = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		
		System.out.println("Hoje é " + data.format(data1) + " e agora são " + horas + " horas e " + minutos + " minutos.");

	}

}
