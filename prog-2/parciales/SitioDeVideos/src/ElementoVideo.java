import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoVideo {
   private String titulo;

   
   
public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}


 public abstract int contarVideos();
 public abstract int duracion();
 public abstract ArrayList<String> getPalabrasClaves(); 

 public abstract ArrayList<Video> buscar(Filtro ff);
 
 public ArrayList<Video> buscar(Filtro ff, 
		                                 Comparator<Video> c1){
	 ArrayList<Video> salida = this.buscar(ff);
	 Collections.sort(salida,c1);
	 return salida;
 }
   
   
}
