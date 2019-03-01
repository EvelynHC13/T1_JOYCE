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
public class Year {
    private Integer days;

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}
	
	
	public Year( Integer dia ) throws InvalidDayException {
		
			if ( dia > 365 ) {
				
				throw new InvalidDayException( " \n Ingreso un Dia Invalido en el Año o el Año Biciesto. \n " );
				
				
			}
			
			days = dia;
		
	}
	
	
	public Integer daysElapsed( Integer mes, Integer dia ) throws IlegalDayException {
		
		Integer[] dias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Integer diaMajor = 0, diaM = ( validarDias(mes, dia) - dia );
		
		for (int i = 0; i < mes; i++) {
			
			//dias[i] = dias[i]++;
			
			diaMajor = dias[i] + diaMajor;
		}
		
		
		return diaMajor - diaM;
		
		}
	
	private Integer validarDias( Integer mes, Integer dia ) {
		

		if ( mes == 1 ) {
			
			dia = 31;
		}
		
		if ( mes == 2 ) {
			
			dia = 28;
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

    public static class IlegalDayException extends Exception {

        public IlegalDayException() {
        }

        IlegalDayException(String _Ingreso_Un_dia_Invalido_para_el_Mes_Dia_) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public static class InvalidDayException extends Exception {

        public InvalidDayException() {
        }

        public InvalidDayException(String __Ingreso_un_Dia_Invalido_en_el_Año_o_el_) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
