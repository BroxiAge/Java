package juego2;

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
	
	public int tirarDados(Dado d1, Dado d2) {
		return d1.tirar()+d2.tirar();
	}
	
}
