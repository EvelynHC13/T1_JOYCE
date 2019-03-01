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
public class GasPrices {
    public void price(double pricePerBarrel){
        System.out.println("Ingrese el precio del Barrel");
        System.out.println("The barrel price is between $ "+ (pricePerBarrel*0.035)+ " and $ "+(pricePerBarrel));
    }
}
