package juego3;

public class Dado {
   
	private int ultimoValor;
	private int cantCaras;
   
	 public Dado() {
		 cantCaras = 6;
		 this.tirar();
		 
	 }
	 public Dado(int cantLados) {
		 cantCaras = cantLados;
		 this.tirar();
		 
	 }
	 
	 
	
	public int getCantCaras() {
		return cantCaras;
	}
	public int tirar() {
		this.ultimoValor= (int)((Math.random()*cantCaras)+1);
		return ultimoValor;
	}

	public int getUltimoValor() {
		return ultimoValor;
	}
	
	public boolean esIgual(Dado dd) {
		return cantCaras == dd.getCantCaras();
	}
	
}
