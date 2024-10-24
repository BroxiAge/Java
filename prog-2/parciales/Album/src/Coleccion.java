import java.util.ArrayList;
import java.util.Collections;

public class Coleccion extends Coleccionable {

	private ArrayList<Coleccionable> eles;
	private double descuento;
	
	
	
	public Coleccion(String nombre, double descuento) {
		super(nombre);
		this.descuento = descuento;
		eles = new ArrayList<Coleccionable>();
	}
	
	

	public double getDescuento() {
		return descuento;
	}



	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public void addElemento(Coleccionable cc) {
		eles.add(cc);
	}


	@Override
	public double getPrecio() {
		double suma = 0;
		for(int i =0; i<eles.size(); i++) {
			suma = suma + eles.get(i).getPrecio();
		}
		return suma - suma*descuento/100;
	}

	@Override
	public ArrayList<Figurita> buscar(Condicion cc) {
		ArrayList<Figurita> salida = new ArrayList<Figurita>();
		for(int i =0; i<eles.size();i++){
			Coleccionable aux = eles.get(i);
			salida.addAll(aux.buscar(cc));
		}
		Collections.sort(salida);
		return salida;
	}

}
