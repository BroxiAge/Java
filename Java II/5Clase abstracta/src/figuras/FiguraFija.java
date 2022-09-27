package figuras;

public class FiguraFija extends FiguraAreaFija{
	
	double perimetro;
	
	public FiguraFija(double area,double per) {
		super(area);
		perimetro = per;
		this.setNombre("Fija");
	}
	
	public double getPerimetro() {
		return perimetro;
	}

}
