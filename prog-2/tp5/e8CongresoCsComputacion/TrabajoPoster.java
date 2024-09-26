package tp5.e8CongresoCsComputacion;

public class TrabajoPoster extends Trabajo{

    public TrabajoPoster(String categoria) {
        super(categoria);
    }

    public boolean acepta(Evaluador ev) {
        System.out.println("TrabajoPoster: Evaluando si el evaluador es aceptado por el trabajo...");

        for (String palabraClave : palabrasClaveList) {
            if (ev.getTemasConocidosList().contains(palabraClave)) {
                System.out.println("Evaluador aceptado. Conoce la palabra clave: " + palabraClave);
                return true;
            }
        }

        System.out.println("Evaluador no aceptado. No conoce ninguna palabra clave del trabajo.");
        return false;
    }
}
