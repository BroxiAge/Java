
public class FiguritaEL extends Figurita {

	private int unidadesDisponibles;
    
	Calculador formaPrecio;
	
	public FiguritaEL(String nombre, String album, double precio, int numero, int numeroExistente, Calculador cc) {
		super(nombre, album, precio, numero);
		this.unidadesDisponibles= numeroExistente;
		formaPrecio =cc;
	}

	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}

	public void setUnidadesDisponibles(int numeroExistente) {
		this.unidadesDisponibles = numeroExistente;
	}

	public Calculador getFormaPrecio() {
		return formaPrecio;
	}

	public void setFormaPrecio(Calculador formaPrecio) {
		this.formaPrecio = formaPrecio;
	}
	
	public double getPrecio() {
		double precioNuevo= formaPrecio.calcular(this);
		double miPrecio = super.getPrecio();
		if (precioNuevo >= miPrecio) {
			return precioNuevo;
		 } else {
			 return miPrecio;
		 }
		
	}
	
}
