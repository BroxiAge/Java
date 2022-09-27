package juego3;

public class Cubilete {
	
	private Dado[] dados;
	
	public Cubilete(int cantidadDados) {
         this(cantidadDados,6);
	}
	public Cubilete(int cantidadDados, int caras) {
		dados = new Dado[cantidadDados];
		for(int i =0; i<dados.length;i++) {
			dados[i]= new Dado(caras);
		}
	}
	
	public Cubilete(Dado[] dados) {
		//MUCHO OJO CON ESTOS CONSTRUCTORES
		this.dados = dados;
		//PIERDO CONTROL DE MI MI MI ESTRUCTURA
		
	}
	
	public int tirarCubilete() {
		int suma = 0;
		for(int i =0; i<dados.length;i++) {
			suma = suma + dados[i].tirar();
		}
		return suma;
	}
	

	public static void main(String[] args) {
		Cubilete cc = new Cubilete(10);
		cc.tirarCubilete();
	}
}
