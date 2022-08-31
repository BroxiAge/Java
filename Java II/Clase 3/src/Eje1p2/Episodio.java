package Eje1p2;

public class Episodio {

	private String titulo;
	private String descripcion;
	private int calificacion;
	
	
	

	public boolean seVio() {
		return (calificacion>0);
	}
	
	
	
	public int getCalificacion() {
		return calificacion;
	}
	
	public void setCalificacion(int calificacion) {
		if ((calificacion>=1)&&(calificacion <=5)) {
		   this.calificacion = calificacion;
		} 
		else {
			System.out.println("MAL MAL la calificacion");
		}
	}
	
	
	
	public Episodio(String titulo, String descripcion, int calificacion) {
		this(titulo,descripcion);
		this.setCalificacion(calificacion);

	}
	
	public Episodio(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.calificacion = -1;
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
	
	
	
	
	
}
