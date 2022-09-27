package agenda;

public class UsuarioLibre extends Usuario{

	
	public boolean podesIr(Reunion r) {
		return true;
	}

	public UsuarioLibre(String mail, int telefono, String nombre) {
		super(mail, telefono, nombre);
		// TODO Auto-generated constructor stub
	}
	
	
}
