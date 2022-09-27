package figuras;

public abstract class FiguraAreaFija extends Figura {

	double area;
	
	public FiguraAreaFija(double b) {
		super("AreaFija");
		area = b;
		
	}

	public double getArea() {
		return area;
	}


	
}
