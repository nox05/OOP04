package zadacha01;

public class Chovek {
	private String ime;
	private String prezime;
	private String maticenBroj;
	
	public Chovek () {
		
	}
	
	public void setIme (String ime) {
		this.ime = ime;
	}
	public void setPrezime (String prezime) {
		this.prezime = prezime;
	}
	public void setMaticenBroj (String maticenBroj) {
		this.maticenBroj = maticenBroj;
	}
	
	public String getIme () {
		return this.ime;
	}
	public String getPrezime () {
		return this.prezime;
	}
	public String getMaticenBroj () {
		return this.maticenBroj;
	}
}

