package parciales.SitioDeVideos.imple;

public class PlayListLenta extends PlayList{

    private int tiempoExtra;

    public PlayListLenta(String titulo, int tiempoExtra) {
        super(titulo);
        this.tiempoExtra = tiempoExtra;
    }

    public PlayListLenta(String titulo) {
        super(titulo);
        this.tiempoExtra = 35;
    }

    @Override
    public int obtenerDuracion() {

        return super.obtenerDuracion() + tiempoExtra;
    }

}
