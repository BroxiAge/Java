package procesadores;

public class ColaOrdenadaCpu extends ColaOrdenada {
    @Override
    public boolean esMenor(Tarea t1, Tarea t2) {
        return t1.getUsoCpu() < t2.getUsoCpu();
    }
}
