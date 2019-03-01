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
public class Dollars {
        double var1 = 20;
        double var2 = 10;
        double var3 = 5;
        double result1;
        double result2;
        double result3;
        
        public double Dollar(){
            
            result1 = (double)18.48*var1;
            result2 = (double)18.48*var2;
            result3 = (double)18.48*var3;
            System.out.println("$20 dollars ---> "+result1); 
            System.out.println("$10 dollars ---> "+result2);
            System.out.println("$5 dollars ---> "+result3); 
            
            return 0; 
        }
}
