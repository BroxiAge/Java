package agenda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reunion {

	String tema;
	ArrayList<Usuario> usuarios;
	Usuario organizador;
	float duracion;
	String lugar;
	
	LocalDate inicio;
	LocalDate fin;
	
	
	public Reunion(String tema, Usuario organizador, float duracion, String lugar) {
		super();
		this.tema = tema;
		this.organizador = organizador;
		this.duracion = duracion;
		this.lugar = lugar;
		usuarios = new ArrayList<Usuario>();
	}
	
	
	public void addParticipante(Usuario u) {
		usuarios.add(u);
	}
	
	public void removeParticipante(Usuario u) {
		usuarios.remove(u);
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public Usuario getOrganizador() {
		return organizador;
	}
	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}
	public float getDuracion() {
		return duracion;
	}
	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public LocalDate getInicio() {
		return inicio;
	}


	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}


	public LocalDate getFin() {
		return fin;
	}


	public void setFin(LocalDate fin) {
		this.fin = fin;
	}
	
	public boolean choca(Reunion r) {
		
		if (inicio.isBefore(r.getInicio()) && 
			fin.isAfter(r.getInicio())	) {
			return true;
		} else {
			if (inicio.isBefore(r.getFin()) && 
				fin.isAfter(r.getFin())) {
				return true;
			} else {
				if (r.getInicio().isBefore(inicio) &&
					r.getFin().isAfter(inicio)	
						)
					return true;
			}
			
		}
		
		return false;
		
	}
	
	
	public boolean esValidad() {
		//es valida si no choca con eventos del duenio y no
		//choca con eventos de los parcipantes;
		
		if (organizador.podesIr(this)) {
			
			for (int i =0; i< usuarios.size(); i++) {
				if (!usuarios.get(i).podesIr(this)) {
					return false;
				}
			}
			return true;
			
		} else {
			return false;
		}
		
	}
	
}
