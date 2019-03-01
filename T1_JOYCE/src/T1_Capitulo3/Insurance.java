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
public class Insurance {
     
    public void CalcularPremium(Integer actual,Integer nacimiento){
        
            int aniosVida = actual - nacimiento;
		int decadas = ((int)aniosVida)/10;
		int premium = (decadas+15)*20;
		System.out.println("The premium is equal : " + premium);
 }   
}
