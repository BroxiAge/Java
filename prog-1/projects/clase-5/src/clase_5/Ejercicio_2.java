package clase_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Escribir un programa que solicite al usuario el ingreso de un número entero
positivo, y muestre por pantalla los valores entre el numero ingresado y 0
de manera decreciente.
 */
public class Ejercicio_2 {

	public static void main(String[] args) {
	
		final int MIN = 0;
		
		int val1 = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Ingrese un numero entero positivo");
			val1 = Integer.valueOf(entrada.readLine());
		
			while (val1 > MIN){
				System.out.println(val1--);
				}
		}
		catch (Exception exc) {
			//imprimo por consola un mensaje con el valor de la variable exc (tipo de error)
			System.out.println(exc);

		}

	}

}
