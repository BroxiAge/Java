package clase_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Escribir un programa que mientras que el usuario ingrese un caracter letra
minúscula, pida ingresar un numero entero. Si el número ingresado está
entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho
numero.
 */
public class Ejercicio_11 {

	public static void main(String[] args) {
		
		int val1 = 0;
		char caracter;
		
		final int X1 = 1;
		final int X2 = 5;
		
		final int MAX = 10;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			
			System.out.println ("Ingrese su valor caracter: ");
			caracter = entrada.readLine().charAt(0);
			
			while (('a'<=caracter)&&(caracter<='z')) {
				
				System.out.println("Ingrese un valor entre: " + X1 + " - " + X2);
				val1 = Integer.valueOf(entrada.readLine());
					if ((val1 >= X1) && (val1 <= X2)){
						for (int numero = 1; numero <= MAX; numero++){
							System.out.println(val1 + " * " + numero + " = " + (val1 * numero));
						}
					}
					else{
						System.out.println("era entre: " + X1 + " - " + X2);
					}
			System.out.println ("Ingrese su valor caracter, MAYUS para salir: ");
			caracter = entrada.readLine().charAt(0);
			}
			
			
			
		}
			catch (Exception exc) {

			//imprimo por consola un mensaje con el valor de la variable exc (tipo de error)
			System.out.println(exc);

			}


	}

}
