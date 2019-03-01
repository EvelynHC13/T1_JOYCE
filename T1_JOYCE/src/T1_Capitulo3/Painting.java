/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo3;
import java.util.Scanner;
/**
 *
 * @author evelyn
 */
public class Painting {
      private String title, artist, medium ;
	private Integer price;
	private double galleryCommission;
	
	public double getGalleryCommission() {
		return galleryCommission;
	}

	public void setGalleryCommission(Integer price) {
		this.galleryCommission = 0.2 * price;
	}
//	public Painting(String title, String artist, String medium, Integer price ) {
	public Painting( ) {
		this.title ="She is beautiful";
		this.artist = "Evelyn";
		this.medium ="Azul";
		this.price = 30000;
		this.galleryCommission = price * 0.2;
	}
	public Painting(int x ) {
		
	}
	@Override
	public String toString() {
		return "Painting [title=" + title + ", artist=" + artist + ", medium=" + medium + ", price=" + price
				+ ", galleryCommission=" + galleryCommission + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
        public static Painting entradaDatos() {

		Scanner in = new Scanner(System.in);
		Painting pinta = new Painting(0);

		
		System.out.println("Ingrese el titulo: ");
		String title = in.nextLine();
		pinta.setTitle(title);

		System.out.println("Ingrese el nombre del Artista: ");
		String artist = in.nextLine();
		pinta.setArtist(artist);

		System.out.println("Ingrese el color : ");
		String medium = in.nextLine();
		pinta.setMedium(medium);

		System.out.println("Ingrese el precio: ");
		Integer price = in.nextInt();
		pinta.setPrice(price);	
		pinta.setGalleryCommission(price);
		return pinta;
	}
 
}
