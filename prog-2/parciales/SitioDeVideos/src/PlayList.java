import java.util.ArrayList;
import java.util.Collections;

public class PlayList extends ElementoVideo {

	ArrayList<ElementoVideo> elementos;
	
	int demora;
	
	
	
	
	
	public PlayList(String titulo, int demora) {
		this.setTitulo(titulo);
		this.demora = demora;
		elementos = new ArrayList<ElementoVideo>();
	}
	
	public void addElemento(ElementoVideo ee) {
		elementos.add(ee);
		
	}	
	public int getDemora() {
		return demora;
	}
	public void setDemora(int demora) {
		this.demora = demora;
	}
	public ArrayList<Video> buscar(Filtro f){
		ArrayList<Video> salida = new ArrayList<Video>();
		
		for(int i =0; i<elementos.size();i++) {
			ElementoVideo ee = elementos.get(i);
			salida.addAll(ee.buscar(f));
		}
		//SOL1
		Collections.sort(salida);
		//SOL ALT
		//ComparadorCompuesto comparador;
		//ComparadorNombre cn = new ComparadorNombre();
		//ComparadorEmail ce = new ComparadorEmail();
		//comparador = new ComparadorCompuesto(cn,ce);
		//Collections.sort(salida,comparador);
		
		return salida;
		
	}
	public int contarVideos() {
		int suma =0;
		for(int i =0; i<elementos.size();i++) {
			ElementoVideo ee = elementos.get(i);
			suma = suma + ee.contarVideos();
		}
		return suma;
	}
	public int duracion() {
		int suma =0;
		for(int i =0; i<elementos.size();i++) {
			ElementoVideo ee = elementos.get(i);
			suma = suma + ee.duracion();
		}
		return suma+demora;
	
	}
	
	public ArrayList<String> getPalabrasClaves(){
		ArrayList<String> salida = new ArrayList<String>();
		
		for(int i =0; i<elementos.size(); i++) {
			ElementoVideo ee = elementos.get(i);
			ArrayList<String> salidaAux = ee.getPalabrasClaves();
			//salida.addAll(salidaAux) NO CONTRROLA REPETOIDOS
			for(int j=0; j<salidaAux.size();j++) {
				if (!salida.contains(salidaAux.get(j))) {
					salida.add(salidaAux.get(j));
				}
			}
			
		}
		return salida;
		
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
