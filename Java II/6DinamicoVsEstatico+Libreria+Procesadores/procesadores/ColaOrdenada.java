package procesadores;

import java.util.ArrayList;

public abstract class ColaOrdenada {

    protected ArrayList<Tarea> misTareas;

    public ColaOrdenada(){
        misTareas = new ArrayList<>();
    }

    public void addTarea(Tarea t) {
        int i = 0;
        boolean encontro = false;
        while(i<misTareas.size() && (!encontro)){
            Tarea subi = misTareas.get(i);
            if (this.esMenor(subi,t)) {
                encontro = true;
            } else {
                i++;
            }
        }
        if (encontro) {
            misTareas.add(i, t);
        } else {
            misTareas.add(t);
        }

    }

    public Tarea siguiente(){
        //return misTareas.remove(0);
        Tarea t = misTareas.get(0);
        misTareas.remove(0);
        return t;
    }

    public boolean tieneTareas() {
        return misTareas.size()>0;
    }

    public void borrarTodas(){
        misTareas.clear();
    }

    public abstract boolean esMenor(Tarea t1, Tarea t2);
}
