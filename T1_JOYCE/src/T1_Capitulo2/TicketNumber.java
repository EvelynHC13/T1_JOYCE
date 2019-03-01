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
public class TicketNumber {
    
    public void Ticket(String codigo){
    
       int code = Integer.parseInt(codigo.substring(0, codigo.length()-1));
       int digit = Integer.parseInt(codigo.substring((codigo.length()-1)));
       int sobrante = code%7;
       
       if(sobrante == digit){
           System.out.println("Ticket True");
       } else {
           System.out.println("Ticket False");
       }
    }
}
