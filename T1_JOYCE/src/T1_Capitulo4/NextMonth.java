/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author evely
 */
public class NextMonth {
    final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos al d�a 
		Date hoy = new Date(); //Fecha de hoy 
		     
		int año = 2018;
		int mes = 3;
		int dia = 1;
		
		Calendar calendar = new GregorianCalendar(año, mes-1, dia); 
		Date fecha = new java.sql.Date(calendar.getTimeInMillis());

		long diferencia = (  fecha.getTime()-hoy.getTime() )/MILLSECS_PER_DAY; 
	//	System.out.println("Dias que faltan para iniciar el siguiente mes: "+diferencia);
}
