package procesadores;

import java.util.ArrayList;

public abstract class Procesador {

	ArrayList<Tarea> misTareas;
	
	public Procesador() {
		misTareas = new ArrayList<Tarea>();
	}
	
	public void addTarea(Tarea t) {
		int i = 0;
		boolean encontro = false;
		while(i<misTareas.size() && (!encontro)){
			Tarea subi = misTareas.get(i);
			if (this.esMenor(subi,t)) {
				encontro = true;
			} else {
				i++;
			}
		}
		if (encontro) {
			misTareas.add(i, t);
		} else {
			misTareas.add(t);
		}
		
	}
	
	public abstract boolean esMenor(Tarea t1, Tarea t2); 
	
	public void ejecutarTarea() {
		if(this.tieneTareas()) {
			Tarea tt = misTareas.get(0);
			tt.ejecutar();
			misTareas.remove(0);
		}
	}
	
	public boolean tieneTareas() {
		return misTareas.size()>0;
	}
	
}
