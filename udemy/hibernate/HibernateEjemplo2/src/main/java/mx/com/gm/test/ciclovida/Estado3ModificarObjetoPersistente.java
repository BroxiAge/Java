package mx.com.gm.test.ciclovida;

import mx.com.gm.domain.Contacto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado3ModificarObjetoPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();

        //Definimos la variable
        Contacto contacto = null;

        //recuperamos el objeto
        //1. transitivo
        contacto = em.find(Contacto.class,3);

        //modificamos el objeto
        contacto.setEmail("clara@mail.com");

        em.getTransaction().begin();

        //2. persistente
        em.merge(contacto);  //esto es para "update"
        //em.persist(contacto); //esto es para guardar la informacion de primera vez
        em.getTransaction().commit();

        System.out.println("contacto = " + contacto);
    }
}
