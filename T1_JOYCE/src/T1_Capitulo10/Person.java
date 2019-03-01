/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo10;

import java.util.Scanner;

/**
 *
 * @author evely
 */
public class Person {
   Scanner d = new Scanner(System.in);
	
	private String name;
	private String lastName;
	private String adress;
	private Integer zipCode;
	private Integer phoneNumber;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
	
	
	public void inicializar() {
		
		System.out.println( " Ingrese el Nombre de su Persona : \n " );
		name = d.nextLine();
		System.out.println( " Ingrese el Apellido de la Persona : \n " );
		lastName = d.nextLine();
		System.out.println( " Ingrese la Direccion de la Persona : \n " );
		adress = d.nextLine();
		System.out.println( " Ingrese el Codigo Zip de la Persona : \n " );
		zipCode = d.nextInt();
		System.out.println( " Ingrese el Numero Telefonico de la Persona : \n " );
		phoneNumber = d.nextInt();
		
	}
	
	
	@Override
	public String toString() {
		
		return " Name : " + name + " " + " Last Name : " + lastName + " " + " Adress : " + " " +
		adress + " " + " Zip Code : " + " " + zipCode + " " + " Phone Number : " + " " + phoneNumber + " \n " ;
		
	} 
}
