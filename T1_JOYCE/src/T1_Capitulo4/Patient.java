/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo4;

/**
 *
 * @author evely
 */
public class Patient {
    private int id;
	private int edad;
	private BloodData blood;
	
	public Patient(){
		this.edad=0;
		this.id=0;
		  BloodData blooda = new BloodData();
		  blooda.setBloodType("O");
		  blooda.setFactorRH('+');
		this.blood=blooda;
	}
	
	
	public Patient(int id, int edad, BloodData blood){
		this.edad=0;
		this.id=0;
		this.blood=blood;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public BloodData getBlood() {
		return blood;
	}
	public void setBlood(BloodData blood) {
		this.blood = blood;
	}
}
