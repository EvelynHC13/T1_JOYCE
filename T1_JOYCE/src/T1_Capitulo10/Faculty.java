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

    public class Faculty extends CollegeEmployee{
    private Boolean tenured;
	
	
	public Boolean getTenured() {
		return tenured;
	}

	public void setTenured(Boolean tenured) {
		this.tenured = tenured;
	}
	
	
	
	

	@Override
	public void inicializar() {
		
		super.inicializar();
		
		System.out.println( " El Empleado es Titular? : \n " );
		tenured = d.nextBoolean();
		
	}
	
	@Override
	public String toString() {
	
		return super.toString() + " is Tenured? " + tenured;
		
	}
	
}
