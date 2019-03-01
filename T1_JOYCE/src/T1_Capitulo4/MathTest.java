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
public class MathTest {
    
     public void maat(){
        double a=Math.sqrt(37);
		double b1=Math.sin(300);
		double b2=Math.cos(300);
		double c1=Math.ceil(22.8);
		double c2=Math.floor(22.8);
		double c3=Math.round(22.8);
		
		double e = (Math.random() * 20) ;
		
		System.out.println("a: "+a);
		System.out.println("b1: "+b1);
		System.out.println("b2: "+b2);
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		System.out.println("c3: "+c3);
		System.out.println("e: "+e);
    }
}
