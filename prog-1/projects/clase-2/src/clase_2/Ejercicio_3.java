package clase_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_3 {

	public static void main(String[] args) {
		String nombre = "";
		String apellido = "";
		String ocupacion = "";
		String direccion = "";
		int edad;
		double altura;
		
		try {

			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Ingrese su nombre: ");
			nombre = String.valueOf(entrada.readLine());
			System.out.println ("Ingrese su apellido: ");
			apellido = String.valueOf(entrada.readLine());
			System.out.println ("Ingrese su ocupación: ");
			ocupacion = String.valueOf(entrada.readLine());
			System.out.println ("Ingrese su direccion: ");
			direccion = String.valueOf(entrada.readLine());
			
			System.out.println ("Ingrese su edad: ");
			edad = Integer.valueOf(entrada.readLine());
			
			System.out.println ("Ingrese su altura: ");
			altura = Double.valueOf(entrada.readLine());
			
			
			
			//imprimo por consola un mensaje con el valor de la variable entero
			System.out.println("Nombre: " + nombre + "\n" +"Apellido: " + apellido + "\n"+ "Ocupacion: " + ocupacion + "\n" + "direccion: " + direccion + "\n" + "Edad: " + edad + "\n" + "Altura: " + altura );

			}
			catch (Exception exc) {

			//imprimo por consola un mensaje con el valor de la variable exc (tipo de error)
			System.out.println(exc);

			}
		
		

	}

}
