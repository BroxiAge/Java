package mx.com.gm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import mx.com.gm.domain.Alumno;

public class AlumnoDAO {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	public AlumnoDAO() {
		
		emf = Persistence.createEntityManagerFactory("HibernatePU");
		em = emf.createEntityManager();
	}
	
	public void listar() {
		String hql = "SELECT p FROM Alumno p";
		Query query = em.createQuery(hql);
		
		List<Alumno> alumnos = query.getResultList();
		for (Alumno p : alumnos) {
			System.out.println("alumno = " + p);
		}
	}

	public void insertar(Alumno persona) {
		// Al no tener un servidor Tipo tomcat, somos responsables de abrir y cerrar la
		// transacción.

		try {
			em.getTransaction().begin();
			em.persist(persona);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
			em.getTransaction().rollback();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

	public void modificar(Alumno persona) {

		try {
			em.getTransaction().begin();
			em.merge(persona);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
			em.getTransaction().rollback();
		}

		finally {
			if (em != null) {
				em.close();
			}
		}
	}

	public void eliminar(Alumno persona) {

		try {
			em.getTransaction().begin();
			em.remove(em.merge(persona));
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
			em.getTransaction().rollback();
		}

//		finally {
//			if(em != null) {
//				em.close();
//			}
//		}
	}
}
