package libreria;

import java.util.ArrayList;

public class Libreria {
    private ArrayList<Publicacion> publicaciones;
    private ArrayList<Cliente> clientes;

    public Libreria(){
        publicaciones = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente c){
        this.clientes.add(c);
    }

    public void agregarPublicacion(Publicacion p){
        publicaciones.add(p);
    }

    public double getPrecio(Publicacion pub, Cliente cliente){
        double precioLista = pub.getPrecio();
        double descuento = cliente.getPorcentajeDescuento();
        return precioLista - (precioLista*descuento)/100;
    }

    public ArrayList<Cliente> clientesParaVenderle(Publicacion pub){
        ArrayList<Cliente> resultado = new ArrayList<>();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).leGusta(pub))
                resultado.add(clientes.get(i));
        }
        return resultado;
    }
}
