package procesadores;

import java.util.ArrayList;

public class Procesador {

	ColaOrdenada misTareas;
	
	public Procesador() {
		misTareas = new ColaOrdenadaMemoria();
	}

	public void addTarea(Tarea tNueva){
		misTareas.addTarea(tNueva);
	}

	public boolean tieneTareas(){
		return misTareas.tieneTareas();
	}
	
	public void ejecutarTarea() {
		if(misTareas.tieneTareas()) {
			Tarea tt = misTareas.siguiente();
			tt.ejecutar();
		}
	}

	public void setFormaOrdenamiento(ColaOrdenada nuevoOrden){
		nuevoOrden.borrarTodas();
		while (misTareas.tieneTareas())
			nuevoOrden.addTarea(misTareas.siguiente());
		misTareas = nuevoOrden;
	}
	
}
