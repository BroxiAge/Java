package juegoDadosHerencia;

public class JugadorTramposo extends Jugador {

	DadoCargado[] dadosC;
	
	public JugadorTramposo(String nombre, DadoCargado[] dadosC) {
		super(nombre);
		this.dadosC = dadosC;
		
	}

	public int tirarDados(Cubilete c) {
		//return c.tirarCubilete();
		//SACAR LOS DADOS DEL CUBILETE
		Dado[] dadosOriginales = c.getDados();
		//PONER LOS CARGADOS
		c.setDados(dadosC);
		int valor = c.tirarCubilete();
		//VUELVE A PONER LOS ORIGINALES
		c.setDados(dadosOriginales);
		return valor;
		
		
		
	}
	
	
	
	
}
