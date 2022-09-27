package deportivos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Establecimiento {

	private String nombre;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Turno>  turnos;
	
	private ArrayList<Cancha>  canchas;
	
	double descuentoSocio; //10% 0.1
	
	public Establecimiento(String n, double descuento) {
		nombre = n;
		descuentoSocio = descuento;
		usuarios = new ArrayList<Usuario>();
		turnos = new ArrayList<Turno>();
		canchas = new ArrayList<Cancha>();
	}
	
	public void addUsuario(Usuario u) {
		if( ! usuarios.contains(u))
		   usuarios.add(u);
	}
	
	public void removeUsuario(Usuario u) {
		usuarios.remove(u);
	}

	public void addCancha(Cancha c) {
		if( ! canchas.contains(c))
		   canchas.add(c);
	}
	
	public void removeCancha(Cancha c) {
		canchas.remove(c);
	}
	
	
	public void addTurno(Turno t) {
		
		if(t.esValido()) {
			turnos.add(t);
		}
	}
	
	public void removeTurno(Turno t) {
		turnos.remove(t);
	}
	
	
	
	
	public boolean estaLibre(Cancha c, LocalDate dia, LocalTime hora, int horas ) {
		
	
		for (int i=0; i<turnos.size();i++) {
			Turno subi = turnos.get(i);
			if (subi.getCanchita().equals(c) && subi.seChoca(dia,hora,horas)) {
				return false;
			}
		
		}
		return true;
	
	
	}
	
	
	
	
//	
	public boolean esSocio(Usuario xx) {
		//HAY QUE HACER
		
		// recorrer los turno y contar cuantos en los ultimos dos 
		//meses alquilo xx
		// subi.getUsuario().equals(xx) 
		int contador = 0;
		LocalDate plazo = LocalDate.now().minusDays(60);
		int i =0;
		while( i<turnos.size()&&(contador<4)){
			Turno subi = turnos.get(i);
			if (subi.getUsuario().equals(xx) && subi.getDia().isAfter(plazo))
				contador++;			
			i++;
		}
		
		return contador>=4;
	}
	
	public double getDescuentoSocio() {
		return descuentoSocio;
	}
	
}
