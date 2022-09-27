package libreria;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        Cliente juli = new Cliente("Juli", "Lopez", "", "");
        Cliente andres = new ClienteExigente("Andres", "Moran", "", "");
        Cliente abel = new Cliente("Abel", "Reyes", "", "");

        andres.setPorcentajeDescuento(15);
        abel.setPorcentajeDescuento(30);

        Publicacion harryPotter = new Publicacion("Harry Potter", "J.K. Rowling", 5000.0, 200, "");
        harryPotter.addGenero("Fantasia");
        harryPotter.addGenero("Juvenil");

        Publicacion harryPotter2 = new Publicacion("Harry Potter", "J.K. Rowling", 5000.0, 200, "");
        harryPotter2.addGenero("Fantasia");
        harryPotter2.addGenero("Juvenil");

        libreria.agregarCliente(juli);
        libreria.agregarCliente(andres);
        libreria.agregarCliente(abel);

        libreria.agregarPublicacion(harryPotter);

        System.out.println("A "+juli.getNombre()+" le cobro $"+ libreria.getPrecio(harryPotter, juli));
        System.out.println("A "+andres.getNombre()+" le cobro $"+ libreria.getPrecio(harryPotter, andres));
        System.out.println("A "+abel.getNombre()+" le cobro $"+ libreria.getPrecio(harryPotter, abel));

        andres.comprar(harryPotter);

        System.out.println("Andres compro harry potter?: "+andres.compro(harryPotter2));

        andres.agregarAutorFavorito("Borges");
        andres.agregarAutorFavorito("J.K. Rowling");
        andres.agregarGeneroFavorito("Terror");

        System.out.println("A Andres le gusta harry potter?: "+andres.leGusta(harryPotter));

    }
}
