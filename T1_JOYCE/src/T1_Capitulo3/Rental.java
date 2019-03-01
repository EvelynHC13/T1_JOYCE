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
public class Rental { 
        public final static Integer minperhour = 60;
	public final static Integer hourlyRental = 40;
	private String contractNnumber; 
	private Integer numberOfHours;
	private Integer numberOfMinutesOverAnHour;
	private Integer price;
	
	
	public String getContractNnumber() {
		return contractNnumber;
	}

	public Integer getNumberOfHours() {
		return numberOfHours;
	}

	public Integer getNumberOfMinutesOverAnHour() {
		return numberOfMinutesOverAnHour;
	}

	public Integer getPrice() {
		return price;
	}

	public void setContractNnumber(String contractNnumber) {
		this.contractNnumber = contractNnumber;
	}
	
	public void setHoursAndMinutes(Integer minutos ) {
		this.numberOfHours = (int)(minutos / 60) ;
		this.numberOfMinutesOverAnHour =(minutos % 60) ;
		this.price = (this.numberOfHours * 40) + this.numberOfMinutesOverAnHour; 
	}

	@Override
	public String toString() {
		return "Rental [contractNnumber= " + contractNnumber + ", numberOfHours= " + numberOfHours
			+ ", numberOfMinutesOverAnHour= " + numberOfMinutesOverAnHour +" pricePerHour= $40"+ ", Precio total=" + price + "]";
	}
}
