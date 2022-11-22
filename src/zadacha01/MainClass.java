package zadacha01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chovek choek = new Chovek();
		
		choek.setIme("Petar");
		choek.setPrezime("Trajkoski");
		choek.setMaticenBroj("0506978440015");
		
		System.out.println(choek.getIme());
		System.out.println(choek.getPrezime());
		System.out.println(choek.getMaticenBroj());
	}

}
