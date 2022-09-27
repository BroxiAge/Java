package procesadores;

public class ProcesadorLLegada extends Procesador {


	public void addTarea(Tarea t) {
		//System.out.println("--" + t);
		misTareas.add(t);
	}
	
	public boolean esMenor(Tarea t1, Tarea t2) {
       return false;
	}

}
