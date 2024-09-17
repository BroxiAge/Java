package tp5.e8CongresoCsComputacion;

public class CongresoMain {

    public static void main(String[] args) {

        Evaluador e = new Evaluador();
        e.agregarTema("matematica");
        e.agregarTema("informatica");
        e.agregarTema("filosofia");

        Evaluador ep = new EvaluadorPoster();
        ep.agregarTema("matematica");
        //ep.agregarTema("otrotema");

        Trabajo t = new Trabajo();
        t.agregarPalabraClave("matematica");
        t.agregarPalabraClave("informatica");
        t.agregarPalabraClave("arte");

        Congreso c = new Congreso();
        c.agregarEvaluador(e);
        c.agregarEvaluador(ep);
        c.agregarTrabajo(t);

        c.ponerALaburarATodos();
    }
}
