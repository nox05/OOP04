package zadacha04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avtomobil auto = new Avtomobil ("Citroen", "C4", "sina", 30000);
		
		auto.mnozenjeKm(2);
		System.out.println(auto.getMarka());
		System.out.println(auto.getModel());
		System.out.println(auto.getBoja());
		System.out.println(auto.getPominatiKm());
	}

}
