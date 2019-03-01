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
public class HolidayCabinRental extends CabinRental{
    public HolidayCabinRental(Integer cabina ) {
		super(cabina);
		
		if ( cabina <= 3 )
			super.weeklyRental  += 150;
			else{
		super.weeklyRental +=150;
			
		
		}
	}
}

