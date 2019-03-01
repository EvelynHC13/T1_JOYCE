/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo3;

/**
 *
 * @author evely
 */
public class Student {
     
    public Student(){
        this.gradePointAverage=4;
	this.idNumber=9999;
	this.numberCreditsE=3;
	this.numberPointE=12;
		
	}
	
	private int idNumber;
	private int numberCreditsE;
	private int numberPointE;
	private double gradePointAverage;
	
	
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public int getNumberCreditsE() {
		return numberCreditsE;
	}
	public void setNumberCreditsE(int numberCreditsE) {
		this.numberCreditsE = numberCreditsE;
	}
	public int getNumberPointE() {
		return numberPointE;
	}
	public void setNumberPointE(int numberPointE) {
		this.numberPointE = numberPointE;
	}
	public double getGradePointAverage() {
		return gradePointAverage;
	}
	public void setGradePointAverage(double gradePointAverage) {
		this.gradePointAverage = gradePointAverage;
	}
	
	
	public double calcularGradePoint(int numberPointE,int numberCreditsE){
		
		return numberPointE/numberCreditsE;
	}
}
