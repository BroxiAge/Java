
public class FiltroPalabraClave extends Filtro {

	String palabra;
	
	@Override
	public boolean cumple(Video v) {
		// TODO Auto-generated method stub
		
		return v.tienePalabraClave(palabra);
	}

}
