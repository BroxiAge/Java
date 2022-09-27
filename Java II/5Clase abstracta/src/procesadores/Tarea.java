package procesadores;

public class Tarea {

	int prio;
	double usoMemoria;
	double usoCpu;
	
	public void ejecutar() {
		System.out.println("Se ejecuto la tarea " +  prio + " " + usoMemoria + " " + usoCpu);
	}
	
	public Tarea(int prio, double usoMemoria, double usoCpu) {
		super();
		this.prio = prio;
		this.usoMemoria = usoMemoria;
		this.usoCpu = usoCpu;
	}
	public int getPrio() {
		return prio;
	}
	public void setPrio(int prio) {
		this.prio = prio;
	}
	public double getUsoMemoria() {
		return usoMemoria;
	}
	public void setUsoMemoria(double usoMemoria) {
		this.usoMemoria = usoMemoria;
	}
	public double getUsoCpu() {
		return usoCpu;
	}
	public void setUsoCpu(double usoCpu) {
		this.usoCpu = usoCpu;
	}
	
	
}
