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
public class CarRental {
    private String renterName;
	private Integer zipCode;
	private Size size;
	private Double dailyRental;
	private Integer days;
	private Double totalRental;
	
	
	public CarRental( String name, Integer zC, Size vS, Integer d ) {
		
		renterName = name;
		zipCode = zC;
		size = vS;
		days = d;
		
		setDailyRental(dailyRental);
		setTotalRental( getDailyRental() );
		
	}


	public String getRenterName() {
		return renterName;
	}


	public void setRenterName(String renterName) {
		this.renterName = renterName;
	}


	public Integer getZipCode() {
		return zipCode;
	}


	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}


	public Size getSize() {
		return size;
	}


	public void setSize(Size size) {
		this.size = size;
	}


	public Double getDailyRental() {
		return dailyRental;
	}


	public void setDailyRental(Double dailyRental) {
		
		if ( size == Size.ECONOMY ) {
			
			this.dailyRental = 29.99 * days;			
		}
		
		if ( size == Size.MID_SIZE ) {
			
			this.dailyRental =  38.99 * days;
		}
		
		if ( size == Size.FULL_SIZE ) {
			
			this.dailyRental =  43.50 * days;
		}
		
	}


	public Integer getDays() {
		return days;
	}


	public void setDays(Integer days) {
		this.days = days;
	}


	public Double getTotalRental() {
		return totalRental;
	}


	public void setTotalRental( Double TotalRental) {
		this.totalRental = dailyRental;
	}
	
	
	public void display() {
		
		System.out.println( " Renter Name : \t " + renterName + " \n " );
		System.out.println( " Zip Code : \t " + zipCode + " \n " );
		System.out.println( " Vehicle Size : \t " + size + " \n " );
		System.out.println( " Daily Rental : \t $ " + dailyRental + " \n " );
		System.out.println( " Days of Rental : \t " + days + " \n " );
		System.out.println( " Total of Rental : \t $ " + totalRental + " \n " );
		
	}
	
}
