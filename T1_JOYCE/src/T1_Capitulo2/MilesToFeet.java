/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo2;

/**
 *
 * @author evely
 */
public class MilesToFeet {
    
    private double feets = 5280;
    private double var;
    private double mille = (double) 8.5;

public double Miles(){
    
    var = mille * feets;
    System.out.println("The distance to my uncle's house is: "+mille+" Miles or "+var+" feets");
    return 0;
    
    }    
}
