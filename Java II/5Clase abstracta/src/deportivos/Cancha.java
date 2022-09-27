package deportivos;

import java.util.ArrayList;



public class Cancha {

	String nombre;
	String tipoDeporte;
	double valor;
	
	ArrayList<Turno> misTurnos; 
	
	public boolean equals(Object o1) {
		try {
			Cancha elOtro = (Cancha)o1;
			return nombre.equals(elOtro.getNombre()) 
					    && tipoDeporte.equals(elOtro.getTipoDeporte());
		} catch(Exception e) {
			return false;
		}
	}
	
	
	public Cancha(String nombre, String tipoDeporte, double valor) {
		super();
		this.nombre = nombre;
		this.tipoDeporte = tipoDeporte;
		this.valor = valor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoDeporte() {
		return tipoDeporte;
	}
	public void setTipoDeporte(String tipoDeporte) {
		this.tipoDeporte = tipoDeporte;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
