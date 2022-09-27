package figuras;

public class Circulo extends Figura {

	double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	public double getArea() {
		return Math.PI*radio*radio;
	}
	public double getPerimetro() {
		return Math.PI*radio*2;
	}
	
	public String getNombre() {
		return "Circulo";
	}
	public void imprimirValores() {
		System.out.println(this.getNombre() +"-"+ 
				           this.getArea() +
				           this.getPerimetro());
	}
	
	
}
