package test;

import dominio.Persona;



public class PersonaPrueba {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 5000.00, false);
        
        System.out.println("p1 = " + p1);
        p1.setNombre("Osvaldo");
        
//        System.out.println("Nuevo nombre = " + p1.getNombre());
//        System.out.println("Sueldo = " + p1.getSueldo());
//        System.out.println("Eliminado = " + p1.isEliminado());
        System.out.println("p1 = " + p1);
    }
    
}
