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
public class Student extends Person {
    private String studyField;
	private Double averagePoint;
	
	
	public String getStudyField() {
		return studyField;
	}
	
	public void setStudyField(String studyField) {
		this.studyField = studyField;
	}
	
	public Double getAveragePoint() {
		return averagePoint;
	}
	
	public void setAveragePoint(Double averagePoint) {
		this.averagePoint = averagePoint;
	}
	
	
	
	
	@Override
	public void inicializar() {

		System.out.println( " Ingrese el Nombre de su Alumno : \n " );
		setName(d.nextLine());
		System.out.println( " Ingrese el Apellido del Alumno : \n " );
		setLastName(d.nextLine());
		System.out.println( " Ingrese la Direccion del Alumno : \n " );
		setAdress(d.nextLine());
		System.out.println( " Ingrese el Codigo Zip del Alumno : \n " );
		setZipCode(d.nextInt());
		System.out.println( " Ingrese el Numero Telefonico del Alumno : \n " );
		setPhoneNumber(d.nextInt());
		System.out.println( " Ingrese el Campo de Estudio del Alumno : \n " );
		studyField = d.nextLine();
		System.out.println( " Ingrese el Promedio de Calificacion del Alumno : \n " );
		averagePoint = d.nextDouble();
		
	}
	
	@Override
	public String toString() {

		return " Name : " + getName() + " " + " Last Name : " + getLastName() + " " + " Adress : " + " " +
				getAdress() + " " + " Zip Code : " + " " + getZipCode() + " " + " "
						+ "Phone Number : " + " " + getPhoneNumber() + " Field of Study : " +
				studyField + " " + " Grade Point Average  : " + averagePoint + " \n " ;
		
		
		
	}

    public void setIdNumber(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNumberCreditsE(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNumberPointE(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setGradePointAverage(double gradePoint) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNumberCreditsE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNumberPointE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getGradePointAverage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double calcularGradePoint(String numberPointE, String numberCreditsE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
