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
public class Eggs {
    double amount1;
    double amount2;
    double amount3;
    double amount4;
    double amount5;
    double amount6;
    int var;
    
    public double Egg(double dato){
        amount1 = (int)(var/12);
        amount2 = dato%12;
        amount3 = 3.25%12;
        amount4 = .45*amount2;
        amount5 = amount3+amount4;
        
        System.out.println("Your order "+var+" eggs "+amount1+" That's dozen at $3.25 and "+amount2+" each united per dozen .45 cents, for a total of "+amount5 );
        
        return 0;
    }
    
}
