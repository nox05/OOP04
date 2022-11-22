package zadacha03;

public class Proizvod {
	private String ime;
	private String proizvoditel;
	private int cena;
	private double tezhina;
	
	public Proizvod () {
		this.ime = "Brezel crackers mix";
		this.proizvoditel = "Croco";
		this.cena = 85;
		this.tezhina =500;
	}
	
	public String getIme () {
		return this.ime;
	}
	public String getProizvoditel () {
		return this.proizvoditel;
	}
	public int getCena () {
		return this.cena;
	}
	public double getTezhina () {
		return this.tezhina;
 }
}