
public class CalculadorFijo extends Calculador {

	private double precio;
	
	public CalculadorFijo(double precio) {
		super();
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public double calcular(FiguritaEL ff) {
		
		return precio;
	}

}
