import java.util.ArrayList;

public class ColeccionRestrictiva extends Coleccion {

	public ColeccionRestrictiva(String nombre, double descuento) {
		super(nombre, descuento);
		
	}
	
	public ArrayList<Figurita> buscar(Condicion cc) {
		ArrayList<Figurita> salida = new ArrayList<Figurita>();
		return salida;
	}	

}
