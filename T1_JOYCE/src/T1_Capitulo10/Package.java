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
public class Package {
    
    private Double weight;
	private Other character;
	private Double precio;
	char l = 0;

	public Package( Double peso,  Other c) {
		
		weight = peso;
		character = c;
		
		calculateCost();
		
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	public Other getCaracter() {
		return character;
	}

	public void setCaracter(Other caracter) {
		this.character = caracter;
	}
	
	
	
	private char shippingMethod( Other m ) {
		
		switch ( m ) {
		
		case AIR : l = 'a';
		
		break;
		
		case TRUCK : l = 't';
		
		break;
		
		case MAIL : l = 'm';
		
		break;
		
		default : System.out.println( " Incorrect Character. \n " );
		
		}
		
		return l;
		
	}
	
	public Double calculateCost() {
		
		char validar = shippingMethod( character );
		
		if ( weight >= 1 && weight <= 8 ) {
			
			if ( validar == 'a' ) {
				
				precio = 2.00;
			}
			
			if ( validar == 't' ) {
				
				precio = 1.50;				
			}
			
			if ( validar == 'm' ) {
				
				precio = 0.50;
				
			}
			
			
		}
		
		if ( weight >= 9 && weight <= 16 ) {
			
			if ( validar == 'a' ) {
				
				precio = 3.00;
			}
			
			if ( validar == 't' ) {
				
				precio = 2.35;				
			}
			
			if ( validar == 'm' ) {
				
				precio = 1.50;
				
			}
			
			
		}
		
		if ( weight >= 17 ) {
			
			if ( validar == 'a' ) {
				
				precio = 4.50;
			}
			
			if ( validar == 't' ) {
				
				precio = 3.25;				
			}
			
			if ( validar == 'm' ) {
				
				precio = 2.15;
				
			}
			
			
		}
		
		return precio;
		
	}

	public void display() {

		/*
		System.out.println( " Weight(Oz.)   " + " Air($)   " +   " Truck($)   " +   "Mail($)   \n ");
		System.out.println( " 1 - 8 \t \t" + " 2.00    " + "   1.50   " + "   0.50   \n "   );
		System.out.println( " 9 - 16 \t" + " 3.00   " + "    2.35   " + "   1.50   \n "   );
		System.out.println( " 17+  \t \t" + " 4.50   " + "    3.25   " + "   2.15   \n "   );
		*/
		
		Double a = 0.00, t = 0.00, m = 0.00;
		
		if ( weight >= 1 && weight <= 8 ) {
			
			if ( l == 'a' ) {
				
				precio = 2.00;
			}
			
			if ( l == 't' ) {
				
				precio = 1.50;				
			}
			
			if ( l == 'm' ) {
				
				precio = 0.50;
				
			}
			
			System.out.println( " \n Package Weight " + "   " + " Kind of Shipping " );
			System.out.println("   " + weight + " Oz." + " \t \t  " + l );
			
			
		}
		
		if ( weight >= 9 && weight <= 16 ) {
			
			if ( l == 'a' ) {
				
				precio = 3.00;
			}
			
			if ( l == 't' ) {
				
				precio = 2.35;				
			}
			
			if ( l == 'm' ) {
				
				precio = 1.50;
				
			}
			
			System.out.println( " Package Weight " + "   " + " Kind of Shipping " );
			System.out.println("   " + weight + " Oz." + "      " + l );
			
		}
		
		if ( weight >= 17 ) {
			
			if ( l == 'a' ) {
				
				precio = 4.50;
			}
			
			if ( l == 't' ) {
				
				precio = 3.25;				
			}
			
			if ( l == 'm' ) {
				
				precio = 2.15;
				
			}
			
			System.out.println( " Package Weight " + "   " + " Kind of Shipping " );
			System.out.println("   " + weight + " Oz." + "      " + l );
			
                }
}
}
