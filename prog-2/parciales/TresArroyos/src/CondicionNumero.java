
public class CondicionNumero extends Condicion {

	private int nroBuscado;
	public boolean cumple(Figurita cc) {
		
		return cc.getNumero() == nroBuscado;
	}

}
