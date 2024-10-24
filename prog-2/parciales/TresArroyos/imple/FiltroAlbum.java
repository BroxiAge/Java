package parciales.TresArroyos.imple;

public class FiltroAlbum extends Filtro {

    private String album;

    public FiltroAlbum(String album) {
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public boolean acepta(Figurita f) {
        return f.getAlbum().equals(album);
    }
}
