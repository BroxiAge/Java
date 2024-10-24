import java.util.ArrayList;
import java.util.Collections;

public class Video extends ElementoVideo implements Comparable<Video>{

	private Usuario autor;
	private int duracion;
	private int visualizaciones;
	private int meGustas;
	private int noMeGustas;
	private int anio;
	private ArrayList<String> palabrasClaves;
	
	
	
	public ArrayList<String> getPalabrasClaves(){
		return new ArrayList<String>(palabrasClaves);
	}

	public void addPalabraClave(String ss) {
		if (!palabrasClaves.contains(ss)) {
			palabrasClaves.add(ss);
		}
	}
	
	public boolean tienePalabraClave(String ss) {
		return palabrasClaves.contains(ss);
	}
	
	public Usuario getAutor() {
		return autor;
	}
	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	public int duracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getVisualizaciones() {
		return visualizaciones;
	}
	public void setVisualizaciones(int visualizaciones) {
		this.visualizaciones = visualizaciones;
	}
	public int getMeGustas() {
		return meGustas;
	}
	public void setMeGustas(int meGustas) {
		this.meGustas = meGustas;
	}
	public int getNoMeGustas() {
		return noMeGustas;
	}
	public void setNoMeGustas(int noMeGustas) {
		this.noMeGustas = noMeGustas;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	//1a
	public ArrayList<Video> buscar(Filtro f){
		ArrayList<Video> salida = new ArrayList<Video>();
		
		if (f.cumple(this)) {
			salida.add(this);
		}
		Collections.sort(salida);
		return salida;
		
	}

	@Override
	public int compareTo(Video o) {
		
		return autor.compareTo(o.getAutor());
	}
	
	public int contarVideos() {
		return 1;
	}
	
	
	
}
