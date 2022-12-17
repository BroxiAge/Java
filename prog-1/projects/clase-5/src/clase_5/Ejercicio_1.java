package clase_5;
/*
 * Escribir un programa que mientras el usuario ingrese un n�mero entero
menor que 10 y mayor a 1, muestre por pantalla si el n�mero es m�ltiplo de
2 y m�ltiplo de 3 simult�neamente. (�Los valores mencionados deber�an
ser constantes?. De a poco habr�a que definirlos como constantes).
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		int val1 = 0;
		
		final int MAX = 10;
		final int MIN = 1;
		
		final int DPX = 2; /*DPX = DIVISIBLE POR X */
		final int DPY = 3;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Ingrese un numero entero entre 2 y 9");
			val1 = Integer.valueOf(entrada.readLine());
		
			while ((val1 > MIN) && (val1 < MAX)){
				if ((val1 % DPX == 0) && (val1 % DPY == 0)){
					System.out.println("es divisible por " + DPX +" y por " + DPY);
				}
				System.out.println("Ingrese un numero entre 2 y 9 (si no cumple, sale): ");
				val1 = Integer.valueOf(entrada.readLine());
			}
		}
		catch (Exception exc) {

			//imprimo por consola un mensaje con el valor de la variable exc (tipo de error)
			System.out.println(exc);

			}

	}

}
