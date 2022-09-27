package vehiculos.autos;


import vehiculos.motos.Signatura;
import vehiculos.Motor;
import vehiculos.Vehiculo;

public class Automovil extends Vehiculo{


	Motor mm;
    Signatura ss;
    public Automovil() {
        Motor nuevo = new Motor();
        int x = nuevo.cilindros;
       // int y = nuevo.bujias; mismo paquete o hereda
      //  int z = nuevo.baterias;mismo paquete
       // int w = nuevo.valvulas; POR PRIVADO SOLO LA CLASE
        
      }
	
}
