
public class CondicionPrecio extends Condicion {

	private double valor;
	public boolean cumple(Figurita cc) {
		// TODO Auto-generated method stub
		return cc.getPrecio()<valor;
	}

}
