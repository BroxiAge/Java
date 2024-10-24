import java.util.ArrayList;

public class Figurita extends Coleccionable implements Comparable<Figurita>{

	private String album;
	private double precio;
	private int numero;
	
	
	
	
	
	
	
	public Figurita(String nombre, String album, double precio, int numero) {
		super(nombre);
		this.album = album;
		this.precio = precio;
		this.numero = numero;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	@Override
	public ArrayList<Figurita> buscar(Condicion cc) {
	   ArrayList<Figurita> salida = new ArrayList<Figurita>();
	   if (cc.cumple(this)) {
	      salida.add(this);
	   }
	   return salida;
	
	}

	@Override
	public int compareTo(Figurita o) {
		double result = precio - o.getPrecio();

		if (result == 0) {
			return this.getNombre().compareTo(o.getNombre());
		} else {
			if (result > 0) {
				return 1;
			} else {
				return -1;
			}
		}
	}

}
