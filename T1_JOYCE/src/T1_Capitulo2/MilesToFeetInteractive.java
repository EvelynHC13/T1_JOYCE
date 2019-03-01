/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo2;

/**
 *
 * @author evely
 */
public class MilesToFeetInteractive {
    
    private final float feets= 5280;
    private float var;
    private float mille;
    
    public float Interactive(float var, float mille){
        
        var = mille*feets;
        System.out.println("The distance to my uncle's house is: "+mille+" Miller or "+var+" feets");
        return 0;
    }
}
