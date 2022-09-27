package vista;

import java.util.Date;

public class main {

	public static void main(String[] args) {
		Date fecha = new Date();
		System.out.println (fecha.getHours());
		System.out.println (fecha.getMinutes());
		System.out.println (fecha.getDate());
		System.out.println(fecha.toLocaleString());
		System.out.println(fecha.getYear()+1900);
		
		float n = (float) (90+Math.random()*(101-90));
		
		System.out.println("--> "+n);
		
	}

}
