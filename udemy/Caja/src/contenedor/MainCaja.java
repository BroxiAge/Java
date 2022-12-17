package contenedor;

public class MainCaja {
    public static void main(String[] args) {
        Caja c1 = new Caja(3, 2, 6);
        System.out.println("Ancho = " + c1.ancho);
        System.out.println("Alto = " + c1.alto);
        System.out.println("Profundo = " + c1.profundo);
        
        int vol = c1.calcularVolumen();
        System.out.println("vol = " + vol);
    }
 
}
