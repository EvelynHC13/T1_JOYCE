/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo2;

/**
 *
 * @author evelyn
 */
public class ProjectedSales {
    
    private float north;
    private float south;
    private final float percent = (float) .10;
    
    public float projected(){
        
        north = 4000*percent;
        south = 5500*percent;
        System.out.println("The next year's projected sales for North division with 10 percent increase is: "+north);
        System.out.println("The next year's projected sales for South division with 10 percent increase is: " +south);
        return 0;
        
    }

}
