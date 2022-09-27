package procesadores;

import java.util.ArrayList;

public class Cpu {

	public static void main(String[] args) {
		
		Tarea t1 = new Tarea(10,100,10);
		Tarea t2 = new Tarea(100,1,100);
		Tarea t3 = new Tarea(20,500,1000);
		Tarea t4 = new Tarea(1,30,10000);
		Tarea t5 = new Tarea(500,10,50);
		Tarea t6 = new Tarea(5000,10,300);
		
		Procesador pp = new Procesador();
		pp.addTarea(t1);
		pp.addTarea(t2);
		pp.addTarea(t3);
		pp.addTarea(t4);
		pp.addTarea(t5);
		pp.addTarea(t6);

		pp.setFormaOrdenamiento(new ColaOrdenadaCpu());

		pp.addTarea(new Tarea(1,1,50000));

		pp.setFormaOrdenamiento(new ColaOrdenadaPrioridad());

		while(pp.tieneTareas()) {
			pp.ejecutarTarea();
		}
		
		
		
		
		
		
	}
	
}
