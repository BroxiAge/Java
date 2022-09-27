package figuras;

public class Circulo extends Figura {

	double radio;

	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;
		
	}
	
	//SI O SI DEBO IMPLEMENTAR LOS METODOS ABSTRACTOS DE MI PADRE
	//O HAGO ESO O YO SOY ABSTRACTA
	public double getArea() {
		return Math.PI*radio*radio;
	}
	public double getPerimetro() {
		return Math.PI*radio*2;
	}
	
	
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
/*	
	public String toString() {
		return "SOY UN CIRCULO Y NO ME IMPORTA NADA";
	}
*/	
	
}
