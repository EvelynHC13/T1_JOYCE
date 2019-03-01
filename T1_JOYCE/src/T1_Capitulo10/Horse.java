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
public class Horse {
    private Integer año_nacido;
    private String nombre;
    private Razas color;
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Razas getColor() {
        return color;
    }

    public void setColor(Razas color) {
        this.color = color;
    }

    public Integer getAñoNacimiento() {
        return año_nacido;
    }

    public void setAñoNacimiento(Integer añoNacimiento) {
        this.año_nacido = añoNacimiento;
    }
    
}
