
package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        p1.nombre = "Juan";
        p1.apellido = "Otro apellido";
        p1.desplegarInformacion();
        
        Persona p2 = new Persona();
        System.out.println(p2 );
        
        p2.desplegarInformacion();
    }
}
