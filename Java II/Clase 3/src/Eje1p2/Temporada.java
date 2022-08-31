package Eje1p2;

public class Temporada {

	Episodio[] episodios;
	String nombre;
	
	public Temporada(String nombre,int nroEpisodios) {
		this.nombre = nombre;
		episodios = new Episodio[nroEpisodios];
		//[null,null,null,null]
		
	}
	
	public Episodio getEpisodio(int nro) {
		nro = nro -1; // el episodio 1 esta en le lugar 0 de mi arreglo
		if (nro>0 && nro<episodios.length) {
			return episodios[nro];
		} else {
			return null;
		}
	}
	
	public void addEpisodio(Episodio xx, int nro) {
		//Episodio 3 --> lo guardo en episodios[2]
		nro = nro -1;
		if (nro>0 && nro<episodios.length) {
			episodios[nro] = xx;
		}
	}
	

	
	public int getCantidadEpisodios() {
		int suma = 0;
		for(int i =0; i<episodios.length;i++) {
		   if (episodios[i]!= null)
			   suma ++;
			   
		}
		return suma;
	}

	public int getCantidadEpisodiosVistos() {
		int suma = 0;
		for(int i =0; i<episodios.length;i++) {
		   if ((episodios[i]!= null)&& (episodios[i].seVio()) )
			   suma ++;
			   
		}
		return suma;
	}
	
	public int getPromedio() {
		int suma = 0;
		int nros = 0;
		for(int i =0; i<episodios.length;i++) {
		   if ((episodios[i]!= null)&& (episodios[i].seVio()) ) {
			   suma = suma +episodios[i].getCalificacion();
			   nros++;   
		   }  
		}
		return suma/nros; //this.getCantidadEpisodiosVistos()
	}
	
	public boolean seVio() {
		return (this.getCantidadEpisodios() == this.getCantidadEpisodiosVistos());
	}
	
	
}
