package test;

import mx.com.gm.dao.AlumnoDAO;
import mx.com.gm.dao.AsignacionDAO;
import mx.com.gm.dao.ContactoDAO;
import mx.com.gm.dao.CursoDAO;
import mx.com.gm.dao.DomicilioDAO;
import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Alumno;
import mx.com.gm.domain.Asignacion;
import mx.com.gm.domain.Contacto;
import mx.com.gm.domain.Curso;
import mx.com.gm.domain.Domicilio;
import mx.com.gm.domain.Persona;

public class OperacionesHibernateJPA {
	public static void main(String[] args) {
		
		//PersonaDAO personaDAO = new PersonaDAO();
		
		//Persona persona = new Persona();
		
		//persona.setNombre("Carlos");
		//persona.setApellido("Lara");
		//persona.setEmail("clara@gmail.com");
		//persona.setTelefono("2260500777");
		//personaDAO.insertar(persona);
		
		//personaDAO.listar();
		
		//persona.setIdPersona(0);
		//persona.setNombre("nuevo nombre");
		//persona.setEmail("nuevoEmail@lalal.com");
		//personaDAO.modificar(persona);
		
		//persona.setIdPersona(0); 
		//personaDAO.eliminar(persona);
		
		
		//Asignacion asignacion = new Asignacion();
		//AsignacionDAO asignacionDAO = new AsignacionDAO();
		//asignacionDAO.listar();
		
		//Curso curso = new Curso();
		//CursoDAO cursoDAO = new CursoDAO();
		//cursoDAO.listar();
		
		//Domicilio domicilio = new Domicilio();
		//DomicilioDAO domicilioDAO = new DomicilioDAO();
		//domicilioDAO.listar();
		
		//Contacto contacto = new Contacto();
		//ContactoDAO contactoDAO = new ContactoDAO();
		//contactoDAO.listar();
		
		
		//Cargo todos los objetos para poder insertarlo en kaskeidelmao
		
		Domicilio d = new Domicilio();
		DomicilioDAO dDAO = new DomicilioDAO();
		
		//d.setIdDomicilio(4);
		d.setCalle("colon");
		d.setNoCalle("744");
		d.setPais("AR");
		
		//dDAO.insertar(d);
		
		Contacto c = new Contacto();
		//c.setIdContacto(3);
		c.setTelefono("2262-500777");
		c.setEmail("nahuel.di.fiore@gmail.com");
		
		Alumno a = new Alumno();
		//a.setIdAlumno(3);
		a.setDomicilio(d);
		a.setContacto(c);
		a.setNombre("nahuel");
		a.setApellido("Di Fiore");
		
		AlumnoDAO alumnoDAO = new AlumnoDAO();
		
		alumnoDAO.insertar(a);
		
	}
}
