
public class CondicionOr extends Condicion {

	Condicion c1, c2;
	public boolean cumple(Figurita cc) {
		// TODO Auto-generated method stub
		return c1.cumple(cc) || c2.cumple(cc);
	}

}
