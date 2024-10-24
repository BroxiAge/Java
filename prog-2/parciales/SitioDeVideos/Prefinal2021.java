
  class Usuario{
  }
//LA CLASE VIDEO DEBE SER COMPARABLE
  public class Video extends Elemento implements Comparable<Video>{
    Usuario user;
	
	ArrayList<String>  pks;
	...
	// 0 si son iguales
	// negativo si es menor
	// positivo si soy mayor
	public int compareTo(Video elOtro){
	/* Si la forma es por cantidad de visualizacion  
	  if (this.getCantidadVis()> elOtro.getCantidadVis())
		  return 1;
	   else if (this.getCantidadVis()< elOtro.getCantidadVis())
		    return -1;
		else
			return 0;
		*/
		String nombreUsuario = this.user.getNombre();
		String email = this.user.getEmail();
		Usuario userOtro = elOtro.getUsuario();
		String elOtroNombreUsuario = userOtro.getNombre();
		String elOtroEmail = userOtro.getEmail();
		
		int valor = nombreUsuario.compareTo(elOtroNombreUsuario);
		
		if(valor == 0){
			return  email.compareTo(elOtroEmail);
			
		} else {
			 return valor;
		}			
		
		
		
	}
  
    public ArrayList<String> getPalabrasClaves(){
	  	ArrayList<String> salida = new ArrayList<String>();
		salida.addAll(pks);
		return salida;
	}	
	
	public int getCantidadVideos(){
	  return 1;
	
	}
	
	public boolean tienePalabraClave(String pal){
		return pks.contains(pal);
	}	
  }	
	
	
 public class PlayList extends Elemento {
    ArrayList<Elemento> els;	
    int  tiempoExtra=5;	
	/// PLAYLIST
	public ArrayList<Video> buscar(Condicion c){
		ArrayList<Video> salida = new ArrayList<Video>();
		for(Elemento ee:els) {
			salida.addAll(ee.buscar(c));
		}
		Collections.sort(salida);// VER EL ARRAYLIST DE QUE TIPO ES 
		// Y SI O SI EL TIPO TIENE QUE SER COMPARABLE
		return salida;
	}	
	
	
	public ArrayList<String> getPalabrasClaves(){
	  ArrayList<String> salida = new ArrayList<String>();
	  for(int i =0; i< els.size(); i++){
         Elemento ee = els.get(i);//PIdo el elemneto en la posicion i de mi arreglo de Elementos
		 ArrayList<String> aux = ee.getPalabrasClaves();
		 for (int j =0; j< aux.size(); j++){
			if ( !salida.contains(aux.get(j))) // controla que la palabra clave del elemento en la posicion j no este ya en la arreglo de plabras claves de salida
			   salida.add(aux.get(j)); 
		 }
	  }
	  
	  return salida;
	}
	
	public int getCantidadVideos(){
	 //  return els.size(); no sirve por que no cuenta los videos que hay dentro de las playlist que yo podria tener
	 int suma = 0;
	 for(int i = 0; i<els.size(); i++){
		 Elemento ee = els.get(i);
		 suma = suma + ee.getCantidadVideos()
	}
	return suma;
	}
    public int getTiempo(){// EL TIEMPO DE UN COMPUESTO  ES LA SUMA DE LOS TIEMPOS DE CADA UNO DE SUS ELEMENTOS, SIEMPRE PASA LO MISMO EN UN COMPOSITE
	
	 int suma = 0;
	 for(int i = 0; i<els.size(); i++){
		 Elemento ee = els.get(i);
		 suma = suma + ee.getTiempo()
	}
	return suma+tiempoExtra;
	}
 }	
	
	public interface Comparable<T>{
		public int compareTo(T el);
	}	
	
public class PlayListEsponsoreada extends Playlist{
    Video videoEspecial; // GET Y SET

   public ArrayList<Video> buscar(Condicion c){
	   ArrayList<Video> salida = super.buscar(c);
	   salida.add(videoEspecial,0);
	   return salida;
   }
}

public class VideoClave extends Video{
   public boolean tienePalabraClave(String pal){
     return true;
   }
}

public abstract class Elemento{
	
	String titulo; //GET Y SET
	
	public abstract ArrayList<Video> buscar(Condicion c);
	public abstract ArrayList<String> getPalabrasClaves();
	public abstract int getCantidadVideos();
	public abstract int getTiempo();
}