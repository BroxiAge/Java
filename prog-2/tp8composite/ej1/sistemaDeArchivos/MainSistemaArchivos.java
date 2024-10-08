package tp8composite.ej1.sistemaDeArchivos;

public class MainSistemaArchivos {
    public static void main(String[] args) {

        Carpeta raiz = new Carpeta("//");

        Carpeta tudai = new Carpeta("TUDAI");
        Carpeta fotos = new Carpeta("Fotos");
        Carpeta pacman = new Carpeta("Pacman");

        raiz.agregarElemento(tudai);
        raiz.agregarElemento(fotos);
        raiz.agregarElemento(pacman);

        Carpeta primero = new Carpeta("Primer año");
        Carpeta segundo = new Carpeta("Segundo año");

        tudai.agregarElemento(primero);
        tudai.agregarElemento(segundo);


        Carpeta prog2 = new Carpeta("Prog 2");
        Archivo parcial = new Archivo("Parcial");
        Archivo recu = new Archivo("recu");
        Archivo prefi = new Archivo("final");



        prog2.agregarElemento(parcial);
        prog2.agregarElemento(recu);
        prog2.agregarElemento(prefi);

        primero.agregarElemento(prog2);
        System.out.println(tudai.cantidadElementos());

        parcial.setTamanio(10);
        recu.setTamanio(20);
        prefi.setTamanio(30);
        System.out.println(tudai.getTamanio());
    }
}
