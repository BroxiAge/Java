package org.example.defaultMethod;

public interface PersonaA {
    public void caminar();

    default public void hablar(){
        System.out.println("saludos coders. Desde Persona A");
    }
}
