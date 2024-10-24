
public class Usuario implements Comparable<Usuario>{

	private String nombre;
	private String email;
	private int anio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	@Override
	public int compareTo(Usuario o) {
		int result = nombre.compareTo(o.getNombre());
		if (result==0) {
			return email.compareTo(o.getEmail());
		}
		return result;
	}
	
	
}
