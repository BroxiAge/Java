package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "Perez");
        System.out.println("p1 = " + p1);
        System.out.println("p1.nombre = " + p1.nombre);
        System.out.println("p1.apellido = " + p1.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        //super(); llamada al constructor de la clase padre (object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this: " + this );
        new Imprimir().imprimir(this);
    }
}
    class Imprimir {
        public void imprimir (Persona persona){
            System.out.println("persona desde imprimir = " + persona);
            System.out.println("impresion del objeto actual(this) = " + this);
        }
    }