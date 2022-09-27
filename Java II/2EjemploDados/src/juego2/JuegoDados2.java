package juego2;



public class JuegoDados2 {

	private Jugador j1;
	private Jugador j2;
	private Dado dado1;
	private Dado dado2;
	
	private int rondas;
	private int minimo;
	public JuegoDados2(Jugador ju1, Jugador ju2) {
        this(ju1,ju2,6);
	}
	public JuegoDados2(Jugador ju1, Jugador ju2, int caras) {
		this(ju1,ju2,caras,10);
	}
	public JuegoDados2(Jugador ju1, Jugador ju2, int caras,int rondas) {
		this.j1=ju1;
		j2=ju2;
		dado1= new Dado(caras);
		dado2= new Dado(caras);
		this.rondas = rondas;
		minimo=7;
	}

	public Jugador getJugador1() {
		return j1;
	}

	public Jugador getJugador2() {
		return j2;
	}
	
	public Jugador jugar() {
		
		for(int i =0; i<rondas; i++) {
			int dados1 = j1.tirarDados(dado1,dado2);
			int dados2 = j2.tirarDados(dado1,dado2);
			if (dados1>minimo&&dados1>dados2) {
				j1.sumarPuntos();;
			} else {
				if (dados2>minimo&&dados2>dados1) {
					j2.sumarPuntos();;
				}
			}
		}
		return ganador();
	}
	public Jugador ganador() {
		if (j1.getPuntos()>j2.getPuntos()) {
			return j1;
		}else if (j2.getPuntos()>j1.getPuntos()) {
			return j2;
		} else {
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		Jugador j1 = new Jugador("Juan");
		Jugador j10 = new Jugador("Pedro");
			
		JuegoDados2 juego1 = new JuegoDados2(j1,j10,10,120);
		Jugador ganador = juego1.jugar();
		if (ganador!=null) {
			System.out.println(ganador.getNombre());
		}else {
			System.out.println("Empate");
		}
		System.out.println( "puntos " +
		            j1.getPuntos()+"-"+j10.getPuntos());
	
	}
}
