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
public class LabCourse extends CollegeCourse {

    public LabCourse(Depto depto, Integer num, Integer c) {
        super(depto, num, c);
    }
    Double cost;

    @Override
    public void display() {
        System.out.println( " Departament Name : \t " + getDepartament() );
		System.out.println( " Course Number : \t " + getCourseNumber() );
		System.out.println( " Credits's Number : \t " + getCredits() );
		System.out.println( " Course Cost : \t \t $ " + cost );

   
    
}

    @Override
    public void setCost(Double credit) {
            this.cost = ( ( 120 * cost) + 50 );
    }
}

