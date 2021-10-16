package contenedor;

public class Caja {

int ancho;
int profundo;
int alto;

public Caja(){
    
}

public Caja(int ancho, int alto, int profundo){
    this.ancho = ancho;
    this.profundo = alto;
    this. alto = profundo;
}

public int calcularVolumen(){
    return (ancho * alto * profundo);
}

}
