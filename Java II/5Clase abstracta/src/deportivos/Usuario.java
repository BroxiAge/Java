package deportivos;

import java.util.ArrayList;

public class Usuario {

	
	int dni;

	ArrayList<Turno> misTurnos; 
	
	
	
	public Usuario(int dni) {
		super();
		this.dni = dni;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public boolean equals(Object o1) {
		try {
			Usuario elOtro = (Usuario)o1;
			return dni == elOtro.getDni();
		} catch(Exception e) {
			return false;
		}
	}
	
}
