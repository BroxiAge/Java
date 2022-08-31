package juegoDadosHerencia;


public class Jugador {

	private String nombre;
	private int puntos;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		puntos = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}
	
	public void sumarPuntos() {
		puntos ++;
	}
	
	public int tirarDados(Cubilete c) {
		return c.tirarCubilete();
	}
	
	public boolean equals(Object o1) {
	  try {	
		Jugador j1 = (Jugador) o1;
		return nombre.equals(j1.getNombre());
	  } catch(Exception e) {
		  // e.printStackTrace();
		  System.out.println("UN ERROR");
		   return false;
	  }
	}
	
}
