/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo4;

/**
 *
 * @author evely
 */
public class TwoDice {
     static int HIGHEST_DIE_VALUE;
     static int randomValue;
     static  int LOWEST_DIE_VALUE;
     public  void dice(){
        
     randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
     System.out.println("da"+randomValue);
   
        
    }
    
}
