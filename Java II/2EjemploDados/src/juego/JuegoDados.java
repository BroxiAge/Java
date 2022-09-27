package juego;

public class JuegoDados {

	private int puntaje1;
	private int puntaje2;
	
	public JuegoDados() {
		puntaje1 =0;
		puntaje2 =0;
	}
	
	public int tirar() {
		return (int)((Math.random()*6)+1);
	}
	public int jugar() {
		
		for (int i =0; i<10; i++) {
			int dados1 = tirar()+tirar();
			System.out.println("1:"+dados1);
			int dados2 = tirar()+tirar();
			System.out.println("2:"+dados2);
			if (dados1>7&&dados1>dados2) {
				puntaje1++;
			} else {
				if (dados2>7&&dados2>dados1) {
					puntaje2++;
				}
			}
		}
		return ganador();
	}
	
	public int ganador() {
		if (puntaje1>puntaje2) {
			return 1;
		}else if (puntaje2>puntaje1) {
			return 2;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		JuegoDados j1 = new JuegoDados();
		System.out.println(j1.jugar());
	}
	
	
}
