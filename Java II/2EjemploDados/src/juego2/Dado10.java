package juego2;
//CONSTANTE EN CODIGO MAL EJEMPLO MAL DE CLASE VS INSTANCIA
public class Dado10 {
	int ultimoValor;
	   
	 public Dado10() {
		 this.tirar();
	 }
	
	public int tirar() {
		this.ultimoValor= (int)((Math.random()*10)+1);
		return ultimoValor;
	}

	public int getUltimoValor() {
		return ultimoValor;
	}
	
	
	
}
