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
public class FahrenheitToCelsius {
    double var1;
    double var2;
    private Integer grados;
   
    public void conversion(Integer grados){
        var1 = (grados - 32);
        var2 = (double)(var1/1.80000);
        System.out.println("Los grados son: "+grados+" convertidos a fahrenheit"+var2);
    }

    public void conversion(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
