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
public class Car extends Vehicle{

    public Car(Integer w, Double miles) throws CarWheelInvalidException {
		super(4, miles);
		
		if( getnWheels() != 4 ) {
			
			throw new CarWheelInvalidException(" \nEl Auto Solo Puede Tener 4 Llantas!. \n " );
			
		}
		
	}

    public static class CarWheelInvalidException extends Exception {

        public CarWheelInvalidException() {
        }

        private CarWheelInvalidException(String _El_Auto_Solo_Puede_Tener_4_Llantas__) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
