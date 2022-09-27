package vehiculos.motos;

public class Signatura {

	public void getEdad() {}
	public void getEdad(int x) {}
	public void getEdad(int x, String s) {}
	public void getEdad( String s, int x) {}
	
	public static void main(String[] args) {
		Signatura ss = new Signatura();
		ss.getEdad();
		ss.getEdad("hola", 0);
		ss.getEdad(0,"hola");
	}
	
}
