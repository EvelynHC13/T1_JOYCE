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
public class Billing {
    static final double TAX = 0.8;
    double pricePhotoBook = 23.50;
    int numPhotoBooks = 1;
    double cuponDiscount = 2;
    
    public void solucion(){
        double totalPlusTax = pricePhotoBook + (pricePhotoBook* TAX);
        System.out.println("Total computeBilling para un album: "+ totalPlusTax);
    
    
        double subtotalPlusTax = (pricePhotoBook*numPhotoBooks);
        double totalPlusTax2 = subtotalPlusTax+(subtotalPlusTax*TAX);
        System.out.println("Total computeBilling para un album: "+ totalPlusTax2);
    
         double subtotalPlusTax3 = (pricePhotoBook*numPhotoBooks);
         double totalPlusTax3 = subtotalPlusTax+(subtotalPlusTax*TAX);
         System.out.println("Total computeBill para un Album: "+totalPlusTax3);
    }

    public void sol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}