import java.util.ArrayList;

public abstract class Coleccionable {
     private String nombre;

    
     
    public Coleccionable(String nombre) {
		super();
		this.nombre = nombre;
	}
    
	public abstract double getPrecio();
    public abstract ArrayList<Figurita>  buscar(Condicion cc);
     
     
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
     
     
     
}
