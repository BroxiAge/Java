package tp4.e1Alarma;

public class AlarmaLuminosa extends Alarma{

    private boolean encenderLuz;

    public AlarmaLuminosa(boolean hayVidrioRoto, boolean hayPuertaOVentanaRota, boolean hayMovimiento) {
        super(hayVidrioRoto, hayPuertaOVentanaRota, hayMovimiento);
    }

    public void encenderLuz() {
        encenderLuz = super.comprobar();

        if (!encenderLuz) {
            System.out.println("Todo ok");
        }
        System.out.println("Prendiendo la loooz");
    }
}
