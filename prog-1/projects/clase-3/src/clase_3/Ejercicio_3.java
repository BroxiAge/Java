package clase_3;

/* Escribir un programa que permita el ingreso de dos números
enteros por teclado e imprima el resultado de comparar:
_ el primero mayor al segundo.
_ ambos son múltiplos de 2.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		int val1 = 0, val2 = 0;
		//boolean resultado;
		
		try {

			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Ingrese su valor 1: ");
			val1 = Integer.valueOf(entrada.readLine());
			
			System.out.println ("Ingrese su valor 2");
			val2 = Integer.valueOf(entrada.readLine());
			
			
			//imprimo por consola un mensaje con el valor de la variable entero
			System.out.println("El primer valor, es mayor que el 2do" + " El resultado es:" + (val1>val2));
			// no me acuerdo como era para sacar si era multiplo de 2 pero fue
			

			}
			catch (Exception exc) {

			//imprimo por consola un mensaje con el valor de la variable exc (tipo de error)
			System.out.println(exc);

			}

	}

}
