package clase_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_4 {

	public static void main(String[] args) {
		char tipoFactura;
		int numeroFactura;
		String nombreCliente = "";
		String producto1 = "", producto2 ="";
		double importe1, importe2, importeTotal;
		
		
		double altura;
		
		try {

			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Ingrese su edad: ");
			tipoFactura = Character.valueOf(entrada.readLine());
			
			
			
			
			//imprimo por consola un mensaje con el valor de la variable entero
			System.out.println("Nombre: " + nombre + "\n" +"Apellido: " + apellido + "\n"+ "Ocupacion: " + ocupacion + "\n" + "direccion: " + direccion + "\n" + "Edad: " + edad + "\n" + "Altura: " + altura );

			}
			catch (Exception exc) {

			//imprimo por consola un mensaje con el valor de la variable exc (tipo de error)
			System.out.println(exc);

			}
		
		

	}

}