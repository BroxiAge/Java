package tp8composite.ej5AcademiaVirtual;

import java.util.*;

public abstract class UnidadEval extends ElemAv{

    protected List<ElemAv> elemAvList;

    public UnidadEval() {
        elemAvList = new ArrayList<ElemAv>();
    }

    @Override
    public List<String> obtenerListadoConcepto() {
        Set<String> conceptosTotales = new HashSet<>();

        for (ElemAv elem : elemAvList) {
            conceptosTotales.addAll(elem.obtenerListadoConcepto());
        }

        return new ArrayList<>(conceptosTotales);
    }

}
