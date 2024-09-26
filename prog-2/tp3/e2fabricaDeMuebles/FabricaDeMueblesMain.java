package tp3.e2fabricaDeMuebles;

import tp3.e2fabricaDeMuebles.muebles.*;

public class FabricaDeMueblesMain {

    public static void main(String[] args) {

        Mueble s = new Silla(10.0, 10.0, 10.0, "Roble", "Negro");
        Mueble m = new Mesa(10.0, 10.0, 10.0, "Roble", "Rojo");
        Mueble b = new Banco(10.0, 10.0, 10.0, "Roble", "Azul");

        Fabrica f = new Fabrica();

        f.addMueble(s);
        f.addMueble(m);
        f.addMueble(b);

        f.getPrecioCostoTotal();
        f.getPrecioVenta();
    }
}
