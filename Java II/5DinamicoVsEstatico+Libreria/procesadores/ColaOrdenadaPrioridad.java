package procesadores;

public class ColaOrdenadaPrioridad extends ColaOrdenada{
    @Override
    public boolean esMenor(Tarea t1, Tarea t2) {
        return t1.getPrio() < t2.getPrio();
    }
}
