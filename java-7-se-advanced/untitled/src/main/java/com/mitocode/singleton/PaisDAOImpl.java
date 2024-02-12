package com.mitocode.singleton;

import java.util.ArrayList;
import java.util.List;

public class PaisDAOImpl {

    private PaisDAOImpl() {

    }
    public static PaisDAOImpl instancia = null;

    public static PaisDAOImpl getInstance() {
        if (instancia == null) {
            instancia = new PaisDAOImpl();
        }
        return instancia;
    }
    private List<Pais> paisesLst;
    public List<Pais> getPaises() {
        if (paisesLst == null) {
            paisesLst = new ArrayList<>();

            Pais p1 = new Pais("Argentina");
            Pais p2 = new Pais("Peru");
            Pais p3 = new Pais("Venezuela");
            Pais p4 = new Pais("Chile");

            paisesLst.add(p1);
            paisesLst.add(p2);
            paisesLst.add(p3);
            paisesLst.add(p4);

        }
        return paisesLst;
    }
}
