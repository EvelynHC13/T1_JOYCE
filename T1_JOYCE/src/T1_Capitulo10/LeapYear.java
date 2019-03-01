/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo10;

/**
 *
 * @author evely
 */
public class LeapYear extends Year {

	public LeapYear(Integer dia) throws InvalidDayException {
		
		super(dia);
		
		if ( dia > 366 ) {
			
			throw new InvalidDayException("Dia Invalido Para Año Biciesto " );
			
		}
		
		setDays(dia);
		
		
	}

	
	public Integer daysElapsed( Integer mes, Integer dia ) throws IlegalDayException {
		
		if ( dia > validarDias(mes, dia) ) {
			
			throw new IlegalDayException( " Ingreso Un dia Invalido para el Mes. \nDia Mayor al Permitido " );
		}
		
		else {
			
			Integer[] dias = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			Integer diaMajor = 0, diaM = ( validarDias(mes, dia) - dia );
			
			for (int i = 0; i < mes; i++) {
				
				//dias[i] = dias[i]++;
				
				diaMajor = dias[i] + diaMajor;
			}
			
			
			return diaMajor - diaM;
		
		}
		
	}
	
	private Integer validarDias( Integer mes, Integer dia ) {
		

		if ( mes == 1 ) {
			
			dia = 31;
		}
		
		if ( mes == 2 ) {
			
			dia = 29;
		}
		
		if ( mes == 3 ) {
			
			dia = 31;
		}

		if ( mes == 4 ) {
	
			dia = 30;
		}

		if ( mes == 5 ) {
	
			dia = 31;
		}

		if ( mes == 6 ) {
	
			dia = 30;
		}


		if ( mes == 7 ) {
	
			dia = 31;
		}

		if ( mes == 8 ) {
	
			dia = 31;
		}

		if ( mes == 9 ) {
	
			dia = 30;
		}

		if ( mes == 10 ) {
	
			dia = 31;
		}

		if ( mes == 11 ) {
	
			dia = 30;
		}

		if ( mes == 12 ) {
	
			dia = 31;
		}
		
		return dia;
		
	}
}

