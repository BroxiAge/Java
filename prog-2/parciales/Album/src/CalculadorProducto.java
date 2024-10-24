
public class CalculadorProducto extends Calculador {


	Calculador c1,c2;
	@Override
	public double calcular(FiguritaEL ff) {
		
		return c1.calcular(ff) * c2.calcular(ff);
	}

}