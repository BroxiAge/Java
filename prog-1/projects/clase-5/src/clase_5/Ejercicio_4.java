package clase_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Escribir un programa que mientras que el usuario ingrese un número entero
distinto de 0, pida ingresar otro número entero y lo imprima.
 */
public class Ejercicio_4 {

	public static void main(String[] args) {
		
		final int MIN = 0;
		
		int val1 = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Ingrese un numero entero positivo");
			val1 = Integer.valueOf(entrada.readLine());
			
			while (val1 < MIN){
				System.out.println("Le mandaste cualquiera pa" );
				
				System.out.println("Ingrese un numero entero positivo, 0 para salir //VUELTA 1");
				val1 = Integer.valueOf(entrada.readLine());
				
				while (val1 > MIN ){
					System.out.println("Valor ingresado = " + val1 );
					
					System.out.println("Ingrese un numero entero positivo, 0 para salir //VUELTA 2");
					val1 = Integer.valueOf(entrada.readLine());
				}
			}
		}
		
		catch (Exception exc) {
			//imprimo por consola un mensaje con el valor de la variable exc (tipo de error)
			System.out.println(exc);

		}

	}
}
