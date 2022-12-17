import java.io.BufferedReader;
import java.io.InputStreamReader;

        /*
        Hacer un programa completo que mientras el usuario ingrese un numero entero mayor que 0 y menor que 50 realice lo siguiente:
        _acumule en una variable suma el valor ingresado solo si el mismo es par.
        Finalmente cuando sale de la iteracion imprima por pantalla la suma que fue acumulando.
        */
public class Ensayo_1 {

	public static void main(String[] args) {
		
		int val1 = 0;
		int suma = 0;
		final int MAX = 50;
		final int MIN = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
		//el usuario carga un valor la primera vez
		System.out.println("Ingrese un numero entero entre 1 y 50 ");
		val1 = Integer.valueOf(entrada.readLine());
		
		//Si numero es menor que 1 y mayor que 50, continua.
		while ((val1 < MAX) && (val1 > MIN)){
			//Comprueba que sea múltiplo de 2.
			if (val1 % 2 == 0){
				suma += val1;
			}
			
		System.out.println("Ingrese un numero entre 1 y 50 (si no cumple, sale): ");
		val1 = Integer.valueOf(entrada.readLine());
		}
		System.out.println("La suma total de los numeros ingresados, multiplos de 2 es: " + suma);
		
		}

			catch (Exception exc) {

			//imprimo por consola un mensaje con el valor de la variable exc (tipo de error)
			System.out.println(exc);

			}
	}

}
