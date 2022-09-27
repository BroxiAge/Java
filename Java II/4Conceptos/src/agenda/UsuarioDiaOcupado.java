package agenda;

import java.time.DayOfWeek;

public class UsuarioDiaOcupado extends Usuario {

	
	DayOfWeek dd;
	public UsuarioDiaOcupado(DayOfWeek dia, String mail, int telefono, String nombre) {
		super(mail, telefono, nombre);
		dd = dia;
		// TODO Auto-generated constructor stub
	}
	
	public boolean podesIr(Reunion r) {
		
		if (r.getInicio().getDayOfWeek()== dd|| 
			r.getFin().getDayOfWeek()==dd) {
			return false;
		}
		else {
			return super.podesIr(r);
		}
			
	}

}
