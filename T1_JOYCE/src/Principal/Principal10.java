/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import T1_Capitulo10.CabinRental;
import T1_Capitulo10.Candle;
import T1_Capitulo10.Car;
import T1_Capitulo10.CarRental;
import T1_Capitulo10.CollegeCourse;
import T1_Capitulo10.CollegeEmployee;
import T1_Capitulo10.Colors;
import T1_Capitulo10.Depto;
import T1_Capitulo10.Escence;
import T1_Capitulo10.Faculty;
import T1_Capitulo10.HolidayCabinRental;
import T1_Capitulo10.Horse;
import T1_Capitulo10.InsuredPackage;
import T1_Capitulo10.LabCourse;
import T1_Capitulo10.LeapYear;
import T1_Capitulo10.MotorCycle;
import T1_Capitulo10.Other;
import T1_Capitulo10.RaceHorse;
import T1_Capitulo10.Razas;
import T1_Capitulo10.ScentedCandle;
import T1_Capitulo10.Size;
import T1_Capitulo10.Student;
import T1_Capitulo10.Year;
import java.util.Scanner;

/**
 *
 * @author evely
 */
public class Principal10 {

    /**
     * @param args the command line arguments
     * @throws T1_Capitulo10.Year.InvalidDayException
     * @throws T1_Capitulo10.Year.IlegalDayException
     * @throws T1_Capitulo10.Car.CarWheelInvalidException
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
                //HORSE
                Horse caballo = new Horse();
		caballo.setAñoNacimiento(2010);
		caballo.setColor(Razas.CATALAN);
		caballo.setNombre("Aquilani");
		
		RaceHorse deCarreras = new RaceHorse();
		deCarreras.setAñoNacimiento(2002);
		deCarreras.setColor(Razas.ARA_APALOOSA);
		deCarreras.setNombre("LUCIFER!");
		
		System.out.println( " Caballo Normal: \n " );
		
		System.out.println( " El Nombre del Caballo es : \t " + caballo.getNombre() );
		System.out.println( " La Raza del Caballo es : \t " + caballo.getColor() );
		System.out.println( " El Año de Nacimiento del Caballo es : \t " + caballo.getAñoNacimiento() );
		
		System.out.println( " \n Caballo de Carreras : \n " );
		
		System.out.println( " El Nombre del Caballo de Carreras es : \t " + deCarreras.getNombre() );
		System.out.println( " La Raza del Caballo de Carreras es : \t " + deCarreras.getColor() );
		System.out.println( " El Año de Nacimiento del Caballo de Carreras es : \t " + deCarreras.getAñoNacimiento()  );
                
                //CANDLE
                Candle vela = new Candle();
		vela.setAltura(2.2);
		vela.setColor(Colors.AZUL);
		
		ScentedCandle aromatica = new ScentedCandle();
		aromatica.setAltura(4.0);
		aromatica.setColor(Colors.AMARILLO);
		aromatica.setScent(Escence.EUCALIPTO);
		
		System.out.println( " Vela Normal : \n " );
		System.out.println( " El Color de la vela es : \t " + vela.getColor() );
		System.out.println( " La Altura de la Vela es : \t " + vela.getAltura() );
		System.out.println( " El Precio de la Vela es : \t $ " + vela.getPrecio() );
		
		System.out.println( " \n Vela Aromatica : \n " );
		System.out.println( " El Color de la vela Aromatica es : \t " + aromatica.getColor() );
		System.out.println( " LA Escencia de la Vela Aromatica es : \t " + aromatica.getScent() );
		System.out.println( " La Altura de la Vela Aromatica es : \t " + aromatica.getAltura() );
		System.out.println( " El Precio de la Vela Aromatica  es : \t $ " + aromatica.getPrecio() );
		
                //YEAR
                Year año = new Year(200);
		Integer dia = año.daysElapsed(7, 10);
		System.out.println( " Dia Ingresado : \t" + año.getDays() );
		System.out.println( " Dia Dentro del Año : \t " + dia );
	
		LeapYear bisiesto = new LeapYear(99);
		Integer f = bisiesto.daysElapsed(5, 14);
		System.out.println( " \n Dia Ingresado : \t " + bisiesto.getDays() );
		System.out.println( " Dia Dentro del Año Biciesto : \t " + f );
                
                //RENTAL
                CabinRental cabina1 = new CabinRental(5);
		CabinRental cabina2 = new CabinRental(3);
		HolidayCabinRental cabina3 = new HolidayCabinRental(3);
		HolidayCabinRental cabina4 = new HolidayCabinRental(2);
		HolidayCabinRental cabina5 = new HolidayCabinRental(10);
		
		System.out.println( " El Numero de Cabina es : " + cabina1.getCabinNumber() + "   " +  
				" El Costo de la Cabina es : $ " + cabina1.getWeeklyRental() );
		System.out.println( " El Numero de Cabina es : " + cabina2.getCabinNumber() +  "   " +
				" El Costo de la Cabina es : $ " + cabina2.getWeeklyRental() );
		System.out.println( " El Numero de Cabina es : " + cabina3.getCabinNumber() +  "   " +
				" El Costo de la Cabina es : $ " + cabina3.getWeeklyRental() );
		System.out.println( " El Numero de Cabina es : " + cabina4.getCabinNumber() +  "   " +
				" El Costo de la Cabina es : $ " + cabina4.getWeeklyRental() );
		System.out.println( " El Numero de Cabina es : " + cabina5.getCabinNumber() +  "   " +
				" El Costo de la Cabina es : $ " + cabina5.getWeeklyRental() );
		
		//Package
                Package paquete1 = null;
               // paquete1 = new Package(5.00, Other.TRUCK);
		//paquete1.display();
		//System.out.println( " \n El Precio de su Paquete es : $ " + paquete1.calculateCost() );
		
		InsuredPackage paquete2 = new InsuredPackage(4.200, Other.AIR);
		paquete2.display();
		System.out.println( " \n El Precio de su Paquete Asegurado es : $ " + paquete2.additionalCost() );
		
		//car
                CarRental carro = new CarRental("Freed", 2100, Size.MID_SIZE, 4);
		carro.display();
		LuxuryCarRental deLujo = new LuxuryCarRental("Jordy", 4000, Size.MID_SIZE, 3);
		deLujo.display();
		LuxuryCarRental lujo = new LuxuryCarRental("Bob", 4010, Size.FULL_SIZE, 9);
		lujo.display(); 
                
                //course
                Scanner sc = new Scanner(System.in);
		int dep;
		
		System.out.println( " Escoja un Departamento : \n " );
		System.out.println( " 1. LENGUAGE, 2.LITERATURE, 3. SCIENCES, 4. SOCIAL_SCIENCES, "
				+ " 5. MATH, 6. PHYSICAL_EDUCATION, 7. BIO, 8. CHM,  9. CIS, 10. PHY " );
		dep = sc.nextInt();
		
		switch( dep ) {
		
		case 1 :
			
			CollegeCourse curso1 = new CollegeCourse(Depto.LENGUAGE, 101, 1);
			curso1.display();
			
			break;
			
		case 2: 
			
			CollegeCourse curso2 = new CollegeCourse(Depto.LITERATURE, 202, 2);
			curso2.display();
			
			break;
			
		case 3 :
			
			CollegeCourse curso3 = new CollegeCourse(Depto.SCIENCES, 303, 3);
			curso3.display();
			
			break;
			
		case 4 :
			
			CollegeCourse curso4 = new CollegeCourse(Depto.SOCIAL_SCIENCES, 404, 4);
			curso4.display();
			
			break;
			
		case 5 :
			
			CollegeCourse curso5 = new CollegeCourse(Depto.MATH, 505, 5);
			curso5.display();
			
			break;
			
		case 6 :
			
			CollegeCourse curso6 = new CollegeCourse(Depto.PHYSICAL_EDUCATION, 101, 1);
			curso6.display();
			
			break;
			
		case 7 :
			
			LabCourse bio = new LabCourse(Depto.BIO, 606, 6);
			bio.display();
			
			break;
			
		case 8 : 
			
			LabCourse chm = new LabCourse(Depto.CHM, 707, 7);
			chm.display();
			
			break;
			
		case 9 :
			
			LabCourse cis = new LabCourse(Depto.CIS, 808, 8);
			cis.display();
			
			break;
			
		case 10 : 
			
			LabCourse phy = new LabCourse(Depto.PHY, 909, 9);
			phy.display();
			
			break;
			
			
			default : System.out.println( " Ingreso una Opcion Invalida!. \n Ingrese una Opcion Correcta " );
		
		
		}
                
                //CAR
                Car carros = new Car(5, (double) 10);
		MotorCycle moto = new MotorCycle(10, (double) 4);
		System.out.println( carros );
		System.out.println( moto );
                
                //COLLEGELIST
                CollegeEmployee[] empleados = new CollegeEmployee[4];
		Faculty[] facultad = new Faculty[3];
		Student[] students = new Student[7];
		Scanner d = new Scanner(System.in);

		System.out.println( " Que Tipo de Persona Ingresara? \n C, F, S. \n");
		String c = d.next();
		
		switch ( c ) {
		
		case "C" :
			
			for (int i = 0; i < empleados.length; i++) {
				
				empleados[i].inicializar();
				
			}
			
			for (int i = 0; i < empleados.length; i++) {
				
				empleados[i].toString();
				
			}
			
			break;
			
		case "F" :
			
			for (int i = 0; i < facultad.length; i++) {
				
				facultad[i].inicializar();
				
			}
			
			for (int i = 0; i < facultad.length; i++) {
				
				facultad[i].toString();
				
			}
			
			break;
			
		case "S" :
			
			for (int i = 0; i < students.length; i++) {
				
				students.toString();
				
			}
			
			for (int i = 0; i < students.length; i++) {
				
				System.out.println( students[i].toString() );
				
			}
			
			break;
			
			
			default : System.out.println( " Ingreso una Opcion Incorrecta. \n Verifique!. \n Ingrese una Opcion Valida!. \n "  );
		
		}
    }

    private static class LuxuryCarRental {

        public LuxuryCarRental() {
        }

        private LuxuryCarRental(String jordy, int i, Size size, int i0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void display() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }*/
}
