package clase_6;
/*
 * Escribir un programa que mientras el usuario cargue desde
teclado un numero entero distinto de 0, imprima por
pantalla la suma que se obtiene de invocar un método
que calcula la sumatoria de los primeros 200 números
naturales (son números enteros en 1 y 200).
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		int val1;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Ingrese un numero distinto de 0");
			val1 = Integer.valueOf(entrada.readLine());
			
			while (val1 != 0){
				imp_suma_naturales_1_al_200();
				
				System.out.println("Ingrese un numero distinto de 0");
				val1 = Integer.valueOf(entrada.readLine());
			}
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}

	}
	public static void imp_suma_naturales_1_al_200(){
		
		final int MIN = 1;
		final int MAX = 200;
		
		int sum = 0;
		
		for (int i = MIN; i <= MAX; i++){
			sum += i;
		}
		System.out.println("La sumatoria entre 1 y 200 es: " + sum);
		
	}
}
