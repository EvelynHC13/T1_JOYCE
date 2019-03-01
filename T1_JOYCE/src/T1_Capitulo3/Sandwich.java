/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo3;
import T1_Capitulo4.Bread;
import java.util.Scanner;
/**
 *
 * @author evely
 */
public class Sandwich {
    private String ingredients;
    private String type;
    private double price;
    
    public Sandwich(){
        ingredients = "";
        type = "";
        price = 0;
    }

    public Sandwich(Bread bread, SandwichFilling sandwichFill) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setingrediente(String ingrediente){
        this.ingredients= ingredients;
    }
    
    public void settipopan(String tipopan){
        this.type=type;
    }
    
    public void setprecio(double precio){
        this.price=precio;
    }
    
    public String getingredientes(){
        return this.ingredients;
    }
    
    public String gettipopan(){
        return this.type;
    }
    
    public double getprecio(){
        return this.price;
    }   

    public void setBreadType(String wheat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMainIngredient(String tuna) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPrice(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMainIngredient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getBreadType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
