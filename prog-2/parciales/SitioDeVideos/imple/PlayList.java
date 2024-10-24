package parciales.SitioDeVideos.imple;

import parciales.SitioDeVideos.imple.filtro.*;

import java.util.*;

public class PlayList extends ElemDigital {

    private List<ElemDigital> elemDigitalList;

    public PlayList(String titulo) {
        super(titulo);
        this.elemDigitalList = new ArrayList<>();
    }

    private void add(ElemDigital elem) {
        this.elemDigitalList.add(elem);
    }

    public List<ElemDigital> getElemDigitalList() {
        return elemDigitalList;
    }

    public void setElemDigitalList(List<ElemDigital> elemDigitalList) {
        this.elemDigitalList = elemDigitalList;
    }

    @Override
    public List<Video> buscar(Condicion c) {
        List<Video> salida = new ArrayList<>();

        for (ElemDigital elem : elemDigitalList) {
            salida.addAll(elem.buscar(c));
        }

        Collections.sort(salida);
        return salida;
    }

    @Override
    public int obtenerDuracion() {
        int duracionTotal = 0;

        for (ElemDigital elem : elemDigitalList) {
            duracionTotal += elem.obtenerDuracion();
        }

        return duracionTotal;
    }

}
