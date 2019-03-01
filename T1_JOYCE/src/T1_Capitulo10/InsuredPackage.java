/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo10;

/**
 *
 * @author evely
 */
public class InsuredPackage extends Package{

    public InsuredPackage(Double peso, Other c) {
        super(peso, c);
    }
    	Double extraCost;
public Double additionalCost() {
		
		if ( calculateCost() >= 0 && calculateCost() <= 1 ) {
			
			extraCost = calculateCost() + 2.45;
		}
		
		if ( calculateCost() >= 1.01 && calculateCost() <= 3.00 ) {
			
			extraCost = calculateCost() + 3.95;
		}
		
		if ( calculateCost() >= 3.01 ) {
			
			extraCost = calculateCost() + 5.55;
		}
		
		return extraCost;
		
	}

    @Override
    public void display() {
        super.display();
       if ( calculateCost() >= 0 && calculateCost() <= 1 ) {
			
			System.out.println( " \n Costo de Aseguracion : $ " + 2.45 );
		}
		
		if ( calculateCost() >= 1.01 && calculateCost() <= 3.95 ) {
			
			System.out.println( " \n Costo de Aseguracion : $ " + 3.95 );
		}
		
		if ( calculateCost() >= 3.01 ) {
			
			System.out.println( " \n Costo de Aseguracion : $ " + 5.55 );
		} //To change body of generated methods, choose Tools | Templates.
    }
	
}
