package Eje1p2;

public class Serie {

	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	
	Temporada[] temps;

	public Serie(String titulo, String descripcion, String creador, 
			      String genero, int nroTemp) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		temps = new Temporada[nroTemp];
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Temporada getTemporada(int nroT) {
		nroT = nroT-1; //La temporada 1 esta en el 0;
		if (nroT>0 && nroT<temps.length) {
			return temps[nroT];
		} else
			 return null;
	}
	
	public Episodio getEpisodio(int nroE, int nroT) {
		nroT = nroT-1;
		if (nroT>0 && nroT<temps.length) {
			Temporada tt = temps[nroT];
			if (tt!=null) {
				return tt.getEpisodio(nroE);
			} else {
				return null;
			}
		} else
			 return null;
	}
	
	public int cantEpisodios() {
		
		int suma = 0;
		for(int i =0; i<temps.length;i++) {
		   if (temps[i]!= null)
			   suma = suma + temps[i].getCantidadEpisodios();
		}
		return suma;
		
	}
	
	public int cantEpisodiosVistos() {
		
		int suma = 0;
		for(int i =0; i<temps.length;i++) {
		   if (temps[i]!= null)
			   suma = suma + temps[i].getCantidadEpisodiosVistos();
		}
		return suma;
		
	}
	
	
	
	public boolean seVio() {
		return (this.cantEpisodios() == this.cantEpisodiosVistos());
	}
}
