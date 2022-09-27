package agenda;

import java.util.ArrayList;

public class Agenda {

	
	ArrayList<Reunion> reuniones;
	
	
	ArrayList<Usuario> contactos;
	
	Usuario duenio;
	
	public Agenda(Usuario uu) {
		duenio = uu;
		reuniones = new ArrayList<Reunion>();
		contactos = new ArrayList<Usuario>();
	}
	
	public void addReunion(Reunion r) {
	 if(! reuniones.contains(r) && !this.chocaReunion(r)) {
		 reuniones.add(r); 
	 }
		
	
	}
	
	public boolean chocaReunion(Reunion r) {
		
		for(int i= 0; i<reuniones.size();i++) {
			Reunion xx = reuniones.get(i);
			if (xx.choca(r)) {
				return true;
			}
		}
		return false;
		
	}
	
	public void addContacto(Usuario u) {
		if( !this.existeContacto(u))
		    contactos.add(u);
	}
	
	public Usuario getContacto(int pos) {
		return contactos.get(pos);
	}
	
	public Reunion getReunion(int pos) {
		return reuniones.get(pos);
	}
	
	
	public int getCantidadReuniones() {
		return reuniones.size();
	}
	
	public int cantidadContactos() {
		return contactos.size();
	}
	
	public void removeContacto(Usuario u) {
		contactos.remove(u);
		
		}
 	
	public boolean existeContacto(Usuario u) {
		return contactos.contains(u);
	}
}
