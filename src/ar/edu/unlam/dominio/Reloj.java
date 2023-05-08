package ar.edu.unlam.dominio;

import java.util.Calendar;

public class Reloj {
	public static long ahora() {
		return Calendar.getInstance().getTimeInMillis();
	}
}
