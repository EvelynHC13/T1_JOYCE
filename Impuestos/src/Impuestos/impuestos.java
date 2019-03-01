/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impuestos;
import ImpuestosCollection.myArrayList;
import ImpuestosObjects.Camioneta;
import ImpuestosObjects.Particular;
import ImpuestosObjects.Vehiculo;
import ImpuestosObjects.camion;
import ImpuestosObjects.taxi;
import java.awt.Container;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
/**
 *
 * @author Evelyn
 */
public class impuestos {
    public static void main(String[] args) {
        Camioneta camioneta = new Camioneta("ARAGON21", "ASKS210601", "HONDA", 2010, 25000.00, 4,Boolean.FALSE);
        System.out.println(camioneta.CalcularTenencia());
        Particular particular = new Particular("ARAGON21", "ASKS210602", "HONDA", 2010, 25000.00, 4);
        System.out.println(particular.CalcularTenencia());
        camion camion = new camion("ARAGON23", "ASKS210603", "HONDA", 2010, 25000.00, 4, Boolean.FALSE, 4);
        System.out.println(camion.CalcularTenencia());
        taxi taxi = new taxi("ARAGON24", "ASKS210604", "HONDA", 2010, 25000.00, 4, 10);
        System.out.println(taxi.CalcularTenencia());
        
        /*ArrayList<Vehiculo> vehiculos = new ArrayList();
        vehiculos.add(camioneta);
        vehiculos.add(particular);
        vehiculos.add(camion);
        vehiculos.add(taxi);
        for(Vehiculo vehiculo : vehiculos){
            System.out.println(vehiculo.getPlaca());
        }
         */
       /* myArrayList vehiculo = new myArrayList();
        vehiculo.add(camioneta);
        vehiculo.add(particular);
        vehiculo.add(camion);
        vehiculo.add(taxi);
        vehiculo.stream().forEach((vehicul) -> {
            System.out.println(vehicul.getPlaca());
        });
            */
        HashMap global = new HashMap();
        global.put(taxi.getPlaca(), taxi.CalcularTenencia());
        StringTokenizer tk = new StringTokenizer(global.toString(), ",");
        while(tk.hasMoreTokens()){
          System.out.println(tk.nextToken());
        }
    }
}
