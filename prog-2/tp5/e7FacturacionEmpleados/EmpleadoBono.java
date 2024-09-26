package tp5.e7FacturacionEmpleados;

public class EmpleadoBono extends Persona {

    private int cantVentas;
    private int cantVentasObjetivo;
    private int sumaDelBonardo;

    public EmpleadoBono(String nombre, String apellido, int dni, double sueldoMensual,
                        int cantVentasObjetivo, int sumaDelBonardo) {
        super(nombre, apellido, dni, sueldoMensual);
        this.cantVentasObjetivo = cantVentasObjetivo;
        this.sumaDelBonardo = sumaDelBonardo;

    }

    public void setSumaDelBonardo(int sumaDelBonardo) {
        this.sumaDelBonardo = sumaDelBonardo;
    }

    public void vender( ) {
        System.out.println("Vendiendo productos: ");
        this.cantVentas ++;
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() + getBono();
    }

    private boolean cumpliVentasObjetivo(){

        if (cantVentas < cantVentasObjetivo) {
            System.out.println("Aun no llego a la cantidad de ventas. tengo: " + cantVentas + " de :" + cantVentasObjetivo);
            return false;
        }
        System.out.println("Sii, llegue a la cantidad de ventas objetivo. pasen bonardo");
        return true;
    }

    private double getBono() {

        double montoBono = 0;

        if (!cumpliVentasObjetivo()) {
            return montoBono;
        }
        montoBono = this.sumaDelBonardo;
        return montoBono;
    }
}
