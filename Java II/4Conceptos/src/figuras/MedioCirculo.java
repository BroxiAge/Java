package figuras;

public class MedioCirculo extends Circulo {

	public MedioCirculo(double radio) {
		super(radio);
		
	}
	
	public double getArea() {
		return super.getArea()/2;
	}
	
	public String getNombre() {
		return super.getNombre()+"/2";
	}

	
}
