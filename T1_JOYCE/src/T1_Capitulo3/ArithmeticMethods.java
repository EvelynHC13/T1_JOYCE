/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo3;

/**
 *
 * @author evely
 */
public class ArithmeticMethods {
    
    private final Integer x = 12;
    private final Integer y = 22;
    private Integer result;
                
        public void displayNumberPlus10() {
            result = y + x + 10;
            System.out.println("El resultado de la suma es: "+ result);
	}
		
	public void displayNumberPlus100() {
            result = x + y + 100;
            System.out.println("El resultado de la suma es: "+ result);
	}
		
	public void displayNumberPlus1000() {
            result = x + y + 1000;
            System.out.println("El resultado de la suma es: "+ result);
	}
    
}
