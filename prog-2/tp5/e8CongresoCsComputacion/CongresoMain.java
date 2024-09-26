package tp5.e8CongresoCsComputacion;

public class CongresoMain {

    public static void main(String[] args) {

        Evaluador e = new Evaluador();
        e.agregarTema("matematica");
        e.agregarTema("informatica");
        e.agregarTema("filosofia");


        //ARTICULO o RESUMEN
        Trabajo t = new Trabajo("articulo");
        t.agregarPalabraClave("matematica");
        t.agregarPalabraClave("informatica");
        t.agregarPalabraClave("arte");

        // POSTER
        Trabajo tp = new TrabajoPoster("poster");
        tp.agregarPalabraClave("filosofia");


        Congreso c = new Congreso();
        c.agregarEvaluador(e);
        c.agregarTrabajo(t);
        c.agregarTrabajo(tp);

        c.asignarTrabajosAEvaluadores();
    }
}
