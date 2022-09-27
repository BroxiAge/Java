package libreria;

public class ClienteExigente extends Cliente{

    public ClienteExigente(String nombre, String apellido, String dni, String dirección) {
        super(nombre, apellido, dni, dirección);
    }

    @Override
    public boolean leGusta(Publicacion pub) {
        if (super.leGusta(pub)) {
            for (int i = 0; i < generosFavoritos.size(); i++) {
                if (pub.tieneGenero(generosFavoritos.get(i)))
                    return true;
            }
        }
        return false;
    }
}
