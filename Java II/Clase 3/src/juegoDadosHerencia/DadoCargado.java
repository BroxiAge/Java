package juegoDadosHerencia;

public class DadoCargado extends Dado{
	
	int ladoCargado;
	double porcentaje;
	
	public DadoCargado(int ladoCargado, double porc) {
		super();
		this.ladoCargado = ladoCargado;
		porcentaje = porc;
	}
	public DadoCargado(int ladoCargado) {
		super();
		this.ladoCargado = ladoCargado;
		porcentaje = 0.5;
	}
	public DadoCargado() {
		super();
		this.ladoCargado = 6;
		porcentaje = 0.5;
	}
	
	public int tirar() {
	   if (Math.random()<porcentaje) {
		   return ladoCargado;
	   } else {
		   return super.tirar();
	   }
	   
	   
	}

	
	public static void main(String[] args) {
		Dado d1  = new Dado();
		Dado d2  = new DadoCargado(6,0.5);
		for (int i =0; i<100;i++) {
			System.out.println("dado comun "+d1.tirar() + " - Cargado "+ d2.tirar());
		}
		
	}
	
}
