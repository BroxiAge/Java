package mx.com.gm.test.ciclovida;

import mx.com.gm.domain.Contacto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado2RecuperarObjetoPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();

        //No necesitamos iniciar una transaccion para recupearr un objeto.
        //Definimos la variable
        Contacto contacto = null;
        //recuperamos el objeto
        contacto = em.find(Contacto.class,3);
        //detached
        System.out.println("contacto = " + contacto);
    }
}
