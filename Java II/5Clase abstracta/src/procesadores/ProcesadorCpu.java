package procesadores;

public class ProcesadorCpu extends Procesador {

	
	public boolean esMenor(Tarea t1, Tarea t2) {
         return t1.getUsoCpu() < t2.getUsoCpu();		
	}

}
