package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class OperacionesHibernateJPA {
	public static void main(String[] args) {
		
		PersonaDAO personaDAO = new PersonaDAO();
		
		
		Persona persona = new Persona();
		persona.setNombre("Carlos");
		persona.setApellido("Lara");
		persona.setEmail("clara@gmail.com");
		persona.setTelefono("2260500777");
		persona.setIdPersona(9);
		
		//personaDAO.insertar(persona);
		
		
		personaDAO.listar();
		
		
		persona.setIdPersona(0);
		persona.setNombre("nuevo nombre");
		persona.setEmail("nuevoEmail@lalal.com");
		//personaDAO.modificar(persona);
		
		persona.setIdPersona(0);
		personaDAO.eliminar(persona);
		
	}
}
