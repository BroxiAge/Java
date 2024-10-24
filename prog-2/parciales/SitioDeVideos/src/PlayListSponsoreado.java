import java.util.ArrayList;

public class PlayListSponsoreado extends PlayList {

	private Video pago;

	
	
	
	public PlayListSponsoreado(String titulo, int demora, Video pago) {
		super(titulo, demora);
		this.pago = pago;
	}

	public Video getPago() {
		return pago;
	}

	public void setPago(Video pago) {
		this.pago = pago;
	}
	
	public ArrayList<Video> buscar(Filtro f){
		ArrayList<Video> salida = super.buscar(f);
		salida.add(0, pago);
		return salida;
	}
	
	
	
}
