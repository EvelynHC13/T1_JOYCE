/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo3;

/**
 *
 * @author evelyn
 */
public class Salary {
     
    public  void pagoHorasExtras(double tarporhr, double hrsExtras, double hrsRegulares){
      double pagoTotalR= hrsRegulares*tarporhr;
      double pagoTotalE= hrsExtras*(1.5*tarporhr);
      double pagoTotal=pagoTotalR+pagoTotalE;
      
      System.out.println("El pago es: "+pagoTotal);
      
     }
}
