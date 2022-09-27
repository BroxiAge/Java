package agenda;

public class Usuario {

	String mail;
	int telefono;
	String nombre;
	Agenda propia;
	
	
	public boolean podesIr(Reunion r) {
		return !propia.chocaReunion(r);
	}
	
	public Usuario(String mail, int telefono, String nombre) {
		super();
		this.mail = mail;
		this.telefono = telefono;
		this.nombre = nombre;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public boolean equals(Object o1) {
		try {
			Usuario u1 = (Usuario) o1;
			return u1.getNombre().equals(this.nombre);
		} catch(Exception e) {
			return false;
		}
	}
	
	
	
	
}
