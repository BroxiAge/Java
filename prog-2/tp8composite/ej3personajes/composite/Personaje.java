package tp8composite.ej3personajes.composite;

import tp8composite.ej3personajes.*;

public class Personaje extends Componente {
    private int edad;
    private int peso;
    private int fuerzaBase;
    private Fruta fruta;

    public Personaje(String nombre, int edad, int peso, Fruta fruta) {
        super(nombre);
        this.edad = edad;
        this.peso = peso;
        this.fruta = fruta;
        this.fuerzaBase = 125;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public int getCantidadPersonajes() {
        return 1;
    }

    @Override
    public double getFuerza() {
        if (fruta != null) {
            return fruta.calcularFuerza(peso);
        }
        return fuerzaBase;
    }
}
