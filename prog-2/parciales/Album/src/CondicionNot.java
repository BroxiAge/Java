
public class CondicionNot extends Condicion {

	Condicion c1;
	public boolean cumple(Figurita cc) {
		// TODO Auto-generated method stub
		return ! c1.cumple(cc);
	}

}
