package clase_4;

/*Hacer un programa que solicite la carga desde consola de unnumero entero y realice:

Si el numero es positivo, imprima �grande� si es mayor a 100 o �chico � si es menor. Adem�s deber� imprimir que el valor es positivo.

Si no lo es, imprima si el numero es par, o si el numero es m�ltiplo de 3, o ninguna de las opciones anteriores.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		int val1 = -1;
		
		try {

			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println ("Ingrese su primer valor: ");
			val1 = Integer.valueOf(entrada.readLine());
			
			//Si el numero es positivo, imprima �grande� si es mayor a 100 o �chico � si es menor. Adem�s deber� imprimir que el valor es positivo.
			if(val1 > 0){
				System.out.println(val1 + " Es positivo");
				if (val1 > 100 )
					System.out.println("grande");
				else
					System.out.println("chico, como la tuya");
			}
			
			//Si no lo es, imprima si el numero es par, o si el numero es m�ltiplo de 3, o ninguna de las opciones anteriores.
			else if(val1 < 0) {
				System.out.println(val1 + " Es negativo");
				if (val1 % 2 == 0){
					System.out.println(val1 + " Es par");
				}
				else if (val1 % 3 == 0){
					System.out.println(val1 + " Es multiplo de 3");
				}
				else{
					System.out.println(val1 + " No es par ni multiplo de 3");
				}
			}
		}
			catch (Exception exc) {

			//imprimo por consola un mensaje con el valor de la variable exc (tipo de error)
			System.out.println(exc);

			}

	}

}
