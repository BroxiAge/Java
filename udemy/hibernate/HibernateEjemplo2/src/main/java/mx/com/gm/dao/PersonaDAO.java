package mx.com.gm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import mx.com.gm.domain.Persona;

import java.util.List;

import javax.persistence.*;

public class PersonaDAO {

	private EntityManagerFactory emf;
	private EntityManager em;

	public PersonaDAO() {

		emf = Persistence.createEntityManagerFactory("HibernatePU");
		em = emf.createEntityManager();
	}

	public void listar() {
		String hql = "SELECT p FROM Persona p";
		Query query = em.createQuery(hql);

		List<Persona> personas = query.getResultList();
		for (Persona p : personas) {
			System.out.println("p = " + p);
		}
	}

	public void insertar(Persona persona) {
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

	public void modificar(Persona persona) {

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

	public void eliminar(Persona persona) {

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
