package tp3.e2fabricaDeMuebles;

import tp3.e2fabricaDeMuebles.muebles.*;

import java.util.*;

public class Fabrica {

    private List<Mueble> muebleList = new ArrayList<>();

    public void addMueble(Mueble m) {
        this.muebleList.add(m);
        System.out.println("Mueble agregado a la lista: " + m.toString());
    }

    public double getPrecioCostoTotal() {

        double total = 0;

        for (Mueble m: muebleList) {
            total = total + m.getCostoDeFabricacion();
        }

        System.out.println("El precio de venta de todos los productos en stock es: " + total);
        return total;
    }

    public void getPrecioVenta() {

        double costoBase = getPrecioCostoTotal();
        double porcentajeAdicional = 35.0;
        double total = costoBase + (costoBase * (porcentajeAdicional / 100));

        System.out.println("El precio de venta de toda la mercaderia es: " + total);
    }
}
