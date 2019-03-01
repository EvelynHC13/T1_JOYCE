package main;

/**
 *
 * @author evely
 */
public class Ejecutable {

   public static void main(String[] args) {
        Polinomio p1 = new Polinomio();
        Polinomio p2 = new Polinomio();
        
        
        
      
        
        System.out.println("Polinomio 1 a ordenar");
        
        
        p1.agregarMonomio(new Monomio("-5", "3"));
        p1.agregarMonomio(new Monomio("-12", "2"));
        
        p1.recorrerLista();
        System.out.println();
        System.out.println("Polinomio Ordenado");
        p1.ordenarPorExponente();
        p1.recorrerLista();
        System.out.println();
        System.out.println("Polinomio Simplificado");
        p1.simplificar();
        p1.recorrerLista();
        System.out.println();
        System.out.println("Polinomio 2");
        p2.agregarMonomio(new Monomio("2", "3"));
        p2.agregarMonomio(new Monomio("4", "2"));
        

        p2.recorrerLista();
        System.out.println();
        System.out.println("Suma de Los Polinomios");
        p1.sumarPolinomios(p2);
        p1.recorrerLista();
        System.out.println();
        System.out.println("Resta de Los Polinomios");
        p1.restarPolinomios(p2);
        p1.recorrerLista();
        System.out.println();
        
    }
  

}
