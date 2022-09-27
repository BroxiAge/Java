package procesadores;

import java.util.ArrayList;

public class ProcesadorPrioridad extends Procesador{

	

	public ProcesadorPrioridad() {
		super();

	}
	
	public boolean esMenor(Tarea t1, Tarea t2) {
		   return t1.getPrio() < t2.getPrio();	
		}


	
	
	
}
