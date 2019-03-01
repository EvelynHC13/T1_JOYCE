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
public class MetricConversion {
     static final double inches=2.54;
     static final double gallon=3.7854;
     public  void inchesTocentimeters(int number){
		
	double conversion=number*inches;
	System.out.println("El valor ingresado en centimetros es: "+conversion);
        }
	
	public  void gallonsToLiters(int number){
	double conversion=number*inches;
	System.out.println("El valor en litros es: "+conversion);
	}
}
