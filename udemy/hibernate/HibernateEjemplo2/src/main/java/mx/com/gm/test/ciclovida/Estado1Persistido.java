package mx.com.gm.test.ciclovida;

import mx.com.gm.domain.Contacto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado1Persistido {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();
        //Vamos a trabajar con "contacto"

        //1. estado transitivo.
        Contacto contacto = new Contacto();
        contacto.setEmail("clara");
        contacto.setTelefono("11223344");

        //2. persistimos el objeto
        em.getTransaction().begin();

        //No se guardo en la DB AUN.
        em.persist(contacto);
        //Aca es cuando se guarda la info en la base de datos
        em.getTransaction().commit();

        //OPCIONAL
        //em.flush actualiza el estado de la base hasta el punto actual.
        //em.flush();
        //contacto.getIdContacto();

        //3. detached (separado)
        System.out.println("contacto = " + contacto);
    }
}
