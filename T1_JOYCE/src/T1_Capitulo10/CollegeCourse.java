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
public class CollegeCourse {
        private Depto departament;
	private Integer courseNumber;
	private Integer credits;
	private Double cost;
	
	
	public CollegeCourse( Depto depto, Integer num, Integer c ) {
		
		departament = depto;
		courseNumber = num;
		credits = c;
		setCost( (double) c); 
		
	}
	

	public Depto getDepartament() {
		return departament;
	}

	public void setDepartament(Depto departament) {
		this.departament = departament;
	}

	public Integer getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(Integer courseNumber) {
		this.courseNumber = courseNumber;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double credit) {
		
		cost = (double) (120 * credit);
		
	}
	
	
	
	public void display() {
		
		
		System.out.println( " Departament Name : \t " + departament );
		System.out.println( " Course Number : \t " + courseNumber );
		System.out.println( " Credits's Number : \t " + credits );
		System.out.println( " Course Cost : \t \t $ " + cost );
		
		
	}
	
}
