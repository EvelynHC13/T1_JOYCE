/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo3;
import java.util.Scanner;
/**
 *
 * @author evely
 */
public class EventDemo {
     
    private static Scanner in = new Scanner(System.in);

	public static int solicitud() {
            System.out.println("Introduzca cuantas personas asistiran: ");
            int invitados = in.nextInt();
            return invitados;
	}

	public static String getEventNumber() {
            System.out.println("Introduzca el numero de evento : ");
            in.nextLine();
            String eventNumber = in.nextLine();
            return eventNumber;
	}
}
