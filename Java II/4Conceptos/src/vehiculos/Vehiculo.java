package vehiculos;

public class Vehiculo {
   Motor mm2;
   
   public Vehiculo() {
     Motor nuevo = new Motor();
     int x = nuevo.cilindros;
     int y = nuevo.bujias;
     int z = nuevo.baterias;
    // int w = nuevo.valvulas; POR PRIVADO SOLO LA CLASE
     
   }
}
