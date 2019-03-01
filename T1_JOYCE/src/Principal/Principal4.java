/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import T1_Capitulo3.Sandwich;
import T1_Capitulo4.Billing;
import T1_Capitulo4.BirdSighting;
import T1_Capitulo4.BloodData;
import T1_Capitulo4.Bread;
import T1_Capitulo4.Circle;
import T1_Capitulo4.FormLetterWriter;
import T1_Capitulo4.MathTest;
import T1_Capitulo4.Patient;
import T1_Capitulo4.State;
import T1_Capitulo4.TwoDice;

/**
 *
 * @author evely
 */
public class Principal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                //FORMLETTERWRITTER
                FormLetterWriter form = new FormLetterWriter();
                form.displaySalutation("Evelyn");
                form.displaySalutation("Evelyn", "HC");
               
                //BILLING
                Billing data = new Billing();
                data.sol();
                
                //TESTBIRDINGSGHTING
		BirdSighting bird = new BirdSighting();
		System.out.println("Especie: "+bird.getBirdSpecies());
		System.out.println("Numero de vistas: "+bird.getNumberSeen());
		System.out.println("Numero de vistas: "+bird.getNumerDay());
                
                //TESTBLOODDATA
                BloodData blood = new BloodData();
		System.out.println("Tipo de sangre: "+blood.getBloodType());
		System.out.println("Factor RH: "+blood.getFactorRH());
		
		
		BloodData blood2 = new BloodData("AB",'-');
		System.out.println("Tipo de sangre: "+blood2.getBloodType());
		System.out.println("Factor RH: "+blood2.getFactorRH());
                
                //TESTPATIENT
                Patient patient1 = new Patient();
		System.out.println(patient1.getEdad());
		System.out.println(patient1.getId());
		System.out.println(patient1.getBlood().getBloodType());
		System.out.println(patient1.getBlood().getFactorRH());
		
		
		BloodData bloode = new BloodData();
		blood.setBloodType("O");
		blood.setFactorRH('-');
		
		Patient patient2 = new Patient(1,20,blood);
		System.out.println(patient2.getEdad());
		System.out.println(patient2.getId());
		System.out.println(patient2.getBlood().getBloodType());
		System.out.println(patient2.getBlood().getFactorRH());
                
                //TESTSANDWINCHFILLING
                SandwichFilling sandwich1 = new SandwichFilling("jamon y lechiga", 450);
		SandwichFilling sandwich2 = new SandwichFilling("huevo y salchicha", 750);
		SandwichFilling sandwich3 = new SandwichFilling("pollo y tomate", 250);
		
		
                
                //TESTBREAD
                Bread bread1= new Bread("garlic", 50);
		Bread bread2= new Bread("candy", 300);
		Bread bread3= new Bread("integral", 100);
		
		System.out.println(bread1.getType());
		System.out.println(bread1.getCalories());
		System.out.println(bread1.getMessage());
		System.out.println(bread2.getType());
		System.out.println(bread2.getCalories());
		System.out.println(bread1.getMessage());
		System.out.println(bread3.getType());
		System.out.println(bread3.getCalories());
		System.out.println(bread1.getMessage());
                
		//TESTCIRCLE
		Circle circulo = new Circle();
		circulo.setRadius(2.5);
		Circle circulo2 = new Circle();
		circulo2.setRadius(5.5);
		Circle circulo3 = new Circle();
	
		System.out.println("El radio del circulo 1 es: "+circulo.getRadius());
		System.out.println("El radio del circulo 2 es: "+circulo2.getRadius());
		System.out.println("El radio del circulo 3 es: "+circulo3.getRadius());
		
                //MATHTEST
                MathTest mat = new MathTest();
                mat.maat();
                
                //STATE
                State st = new State("OAXACA", 2, "JUAREZ", "OAXACA", "OAXACA", "OAXACA");
                st.getCapital();
                st.getCiudadP();
                st.getPob();
        
                //TWODICE
                TwoDice two = new TwoDice();
                two.dice();
    }

    private static class BirdSighting2 {

        public BirdSighting2() {
        }

        private BirdSighting2(String colibri, int i, int i0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getBirdSpecies() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class SandwichFilling {

        public SandwichFilling() {
        }

        private SandwichFilling(String lettuce, int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
