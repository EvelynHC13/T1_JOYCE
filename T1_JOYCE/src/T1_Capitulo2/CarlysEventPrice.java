/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo2;

/**
 *
 * @author evelyn
 */
public class CarlysEventPrice {
    
    public void Carly(Integer days){
        
    Integer price = 35;
    Integer total;
     
     System.out.println("************************************************");
     System.out.println("* Carly's makes the food that makes it a party *");
     System.out.println("************************************************");
     
     boolean number = (days < 55);
     total = price*days;
     if(number == true)
        System.out.println("The price is: "+total+" a "+number);
     else {
        System.out.println("The price is: "+total+" a "+number);
        }
    }
            
}
