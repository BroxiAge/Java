package tp4.e1Alarma;

public class Alarma {

    protected boolean hayVidrioRoto = false;
    protected boolean hayPuertaOVentanaRota = false;
    protected boolean hayMovimiento = false;

    public Alarma(boolean hayVidrioRoto, boolean hayPuertaOVentanaRota, boolean hayMovimiento) {
        this.hayVidrioRoto = hayVidrioRoto;
        this.hayPuertaOVentanaRota = hayPuertaOVentanaRota;
        this.hayMovimiento = hayMovimiento;
    }

    public boolean isHayVidrioRoto() {
        return hayVidrioRoto;
    }

    public void setHayVidrioRoto(boolean hayVidrioRoto) {
        this.hayVidrioRoto = hayVidrioRoto;
    }

    public boolean isHayPuertaOVentanaRota() {
        return hayPuertaOVentanaRota;
    }

    public void setHayPuertaOVentanaRota(boolean hayPuertaOVentanaRota) {
        this.hayPuertaOVentanaRota = hayPuertaOVentanaRota;
    }

    public boolean isHayMovimiento() {
        return hayMovimiento;
    }

    public void setHayMovimiento(boolean hayMovimiento) {
        this.hayMovimiento = hayMovimiento;
    }

    protected boolean comprobar() {
        if (hayVidrioRoto || hayPuertaOVentanaRota || hayMovimiento) {
            return true;
        } else {
            return false;
        }
    }
}
