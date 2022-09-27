package procesadores;

import java.util.ArrayList;

public class ProcesadorMemoria extends Procesador{

	public ProcesadorMemoria() {
		super();

	}

	
	public boolean esMenor(Tarea t1, Tarea t2) {
	   return t1.getUsoMemoria() < t2.getUsoMemoria();	
	}
	


	

	
	
}
