package mx.com.gm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import mx.com.gm.domain.Contacto;

public class ContactoDAO {
	private EntityManagerFactory emf;
	private EntityManager em;

	public ContactoDAO() {
		emf = Persistence.createEntityManagerFactory("HibernatePU");
		em = emf.createEntityManager();
	}

	public void listar() {
		String hql = "SELECT p FROM Contacto p";
		Query query = em.createQuery(hql);

		List<Contacto> contactos = query.getResultList();
		for (Contacto p : contactos) {
			System.out.println("contacto = " + p);
		}
	}

	public void insertar(Contacto persona) {
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

	public void modificar(Contacto persona) {

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

	public void eliminar(Contacto persona) {

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
