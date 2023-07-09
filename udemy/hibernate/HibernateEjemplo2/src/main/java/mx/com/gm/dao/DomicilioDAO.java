package mx.com.gm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import mx.com.gm.domain.Domicilio;

public class DomicilioDAO {
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public DomicilioDAO() {

		emf = Persistence.createEntityManagerFactory("HibernatePU");
		em = emf.createEntityManager();
	}
	
	public void listar() {
		String hql = "SELECT p FROM Domicilio p";
		Query query = em.createQuery(hql);
		
		List<Domicilio> domicilios = query.getResultList();
		for (Domicilio p : domicilios) {
			System.out.println("domicilio = " + p);
		}
	}

	public void insertar(Domicilio persona) {
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

	public void modificar(Domicilio persona) {

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

	public void eliminar(Domicilio persona) {

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
