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
public class CabinRental {
    
    private Integer cabinNumber;
	public Double weeklyRental;
	
	
	public CabinRental(Integer cabina ) {
		
		cabinNumber = cabina;
		

		if ( cabinNumber <= 3 ) {
			
			weeklyRental = 950.00;
		}
		
		else {
			
		weeklyRental = 1100.00;	
		}
		
	}


	public Integer getCabinNumber() {
		return cabinNumber;
	}


	public Double getWeeklyRental() {
		return weeklyRental;
	}
	
}
