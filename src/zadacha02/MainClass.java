package zadacha02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Restoran rest = new Restoran ();
		
		rest.setIme("Glamour");
		rest.setLokacija("Joska Jordanoski br 94");
		rest.setTelefon("076453502");
		rest.setBrNaSedista(90);
		
		System.out.println(rest.getIme());
		System.out.println(rest.getLokacija());
		System.out.println(rest.getTelefon());
		System.out.println(rest.getBrNaSedista());
	}

}
