package mx.com.gm.test.ciclovida;

import mx.com.gm.domain.Contacto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado4EliminarObjeto {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();

        //Definimos la variable
        Contacto contacto = null;

        //recuperamos el objeto
        //1. transitivo
        contacto = em.find(Contacto.class,4);

        //modificamos el objeto
        contacto.setEmail("clara@mail.com");

        em.getTransaction().begin();

        //2. persistente
        em.remove(em.merge(contacto));
        em.getTransaction().commit();

        //3. transitivo, no detached porque no esta.

        //Esto lo puedo imprimir, porque esta en memoria pero ya no en la db.
        System.out.println("contacto = " + contacto);
    }
}