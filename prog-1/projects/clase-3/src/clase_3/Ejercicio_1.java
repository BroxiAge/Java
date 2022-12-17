package clase_3;

/*Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el cociente de la división de dicho número
con 2, 3, y 4.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_1 {

	public static void main(String[] args) {
		int valIngres = 0;
		final int  dos = 2, tres = 3, cuatro = 4;
		
		
		try {

			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Ingrese su valor a dividir por 2,3 y 4: ");
			valIngres = Integer.valueOf(entrada.readLine());
			
			//imprimo por consola un mensaje con el valor de la variable entero
			System.out.println("El cociente de la divison entre: " + valIngres + "/" + dos + "=" + (valIngres/dos));
			System.out.println("El cociente de la divison entre: " + valIngres + "/" + tres + "=" + (valIngres/tres));
			System.out.println("El cociente de la divison entre: " + valIngres + "/" + cuatro + "=" + (valIngres/cuatro));

			}
			catch (Exception exc) {

			//imprimo por consola un mensaje con el valor de la variable exc (tipo de error)
			System.out.println(exc);

			}
		
		

	}
}


