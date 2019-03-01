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
public class SammysRentalPrice {
    
    public void Sammy(Integer minutes){
        
        int price = 40;
        int total = (((int) (minutes/60)) *price) + (minutes%60);
        
        System.out.println("ssssssssssssssssssssssssssssssssssss");
        System.out.println("s Sammy's makes it fun in the sun  s");
        System.out.println("ssssssssssssssssssssssssssssssssssss");
        
        System.out.println("Total: "+total);
    }
}
