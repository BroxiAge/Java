package ejemplo2;

public class MedioCirculo extends Circulo {

	
	public MedioCirculo(double radio) {
		super(radio);
		
	}
	
	public double getArea() {
		// NUNCA SE USAN CRUZADOS
		// SI USO super.x() tengo que estar en el metodo x
		return super.getArea()/2;
	}
	


}
