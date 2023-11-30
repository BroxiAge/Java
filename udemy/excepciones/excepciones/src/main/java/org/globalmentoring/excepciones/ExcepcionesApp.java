package org.globalmentoring.excepciones;

public class ExcepcionesApp {
    public static void main(String[] args) {
        long resultado = 0;
        try {
            resultado = Aritmetica.division(10, 0);
        }catch (OperacionExcepcion oe) {
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(oe.getMessage());
        }catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Exception");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("se revisó la división entre cero");
        }
    }
}
