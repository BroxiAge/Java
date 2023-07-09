package mx.com.gm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import mx.com.gm.domain.Curso;

public class CursoDAO {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	public CursoDAO() {

		emf = Persistence.createEntityManagerFactory("HibernatePU");
		em = emf.createEntityManager();
	}
	
	public void listar() {
		String hql = "SELECT p FROM Curso p";
		Query query = em.createQuery(hql);
		
		List<Curso> cursos = query.getResultList();
		for (Curso p : cursos) {
			System.out.println("curso = " + p);
		}
	}

	public void insertar(Curso persona) {
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

	public void modificar(Curso persona) {

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

	public void eliminar(Curso persona) {

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
