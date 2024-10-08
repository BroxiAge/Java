package tp8composite.ej2companiaEnvios;

import java.util.*;

public class ComboPostal extends Envio {

    private List<Envio> elementoPostalList;

    public ComboPostal() {
        this.elementoPostalList = new ArrayList<>();
    }

    public void addElementoPostal(Envio elementoPostal) {

            if (elementoPostal.destinatario.getDireccion().equals(this.destinatario.getDireccion())) {
                elementoPostal.setNroTracking(this.getNroTracking());
                this.elementoPostalList.add(elementoPostal);
            }
    }

    @Override
    public void setNroTracking(int nroTracking) {
        super.setNroTracking(nroTracking);
        for (Envio envio : this.elementoPostalList) {
            envio.setNroTracking(nroTracking);
        }
    }

    @Override
    public int getTamanio() {
        int sum = 0;
        for (Envio elem : this.elementoPostalList) {
            sum += elem.getTamanio();
        }
        return sum;
    }
}
