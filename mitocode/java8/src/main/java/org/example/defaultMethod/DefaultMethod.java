package org.example.defaultMethod;

public class DefaultMethod implements PersonaA, PersonaB{
    @Override
    public void caminar() {
        System.out.println("Hola coders, estoy caminando");
    }

    @Override
    public void hablar() {
        //PersonaA.super.hablar();
        //PersonaB.super.hablar();
        System.out.println("Desde el override!");
    }

    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.hablar();
    }
}
