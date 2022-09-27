package juegoDadosHerencia;

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
	
	public boolean equals(Object o1) {
       Dado d = (Dado)o1;
       return d.getCantCaras() == this.getCantCaras();
		
	}
	
	public String toString() {
		return "SOY UN DADO DE: " + this.getCantCaras();
	}
	
}
