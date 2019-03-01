/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo3;

/**
 *
 * @author evely
 */
public class Interest {
    static final double interest=.05;
    static final double twelve_months=12;
    
        public void calcularInversion(double inversionInicial){
            double interesMensual=inversionInicial*interest;
            double interesAnual=interesMensual*twelve_months;
            double total=inversionInicial+interesAnual;
            System.out.println("La inversion inicial es de "+inversionInicial+" con tasa de interes de 5% a 12 meses tu tendrias "+total);
    }
}
