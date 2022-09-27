package ejemplo2;

public class Figura {
	
	private String nombre;
	
	public Figura(String nn) {
		nombre = nn;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPerimetro() {
		return 0;///MAS ADELANTE VOLVEMOS
	}
	public double getArea() {
		return 0;///MAS ADELANTE VOLVEMOS
	}

//NO IMPRIMIR EN LOS OBJETOS
	public void imprimir() {                 //BINDING DINAMICO
		System.out.println("mi area es " + this.getArea());
	}
	
	
}
