package parciales.SitioDeVideos.imple;

import parciales.SitioDeVideos.imple.filtro.*;

import java.util.*;

public class PlayListEsponsoreada extends PlayList {

    private Video videoEspecial;

    public PlayListEsponsoreada(String titulo, Video video) {
        super(titulo);
        this.videoEspecial = video;
    }

    @Override
    public List<Video> buscar(Condicion c){
        List<Video> salida = super.buscar(c);
        salida.add(videoEspecial,0);
        return salida;
    }
}
