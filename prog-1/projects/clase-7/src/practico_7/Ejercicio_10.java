package practico_7;
/*
 * Hacer un programa que dado el arreglo definido y precargado permita
obtener a trav�s de m�todos la posici�n de inicio y la posici�n de fin de la
secuencia ubicada a partir de una posici�n entera ingresada por el
usuario. Finalmente, si existen imprima por pantalla ambas posiciones
obtenidas.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class Ejercicio_10 {
public static final int MAX = 20;
public static final int MAXVALOR = 9;
public static final int MINVALOR = 1;
public static final double probabilidad_letra = 0.4;
public static final double probabilidad_numero = 0.4;

	public static void main(String[] args) {
			
			int [] arrint;
			int inicio = 0;
			int fin = 0;
			arrint = new int[MAX];
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try{
				cargar_arreglo_int_arbitrario(arrint);
				
				System.out.println("Ingrese la primera pos del array");
				inicio = Integer.valueOf(entrada.readLine());
				imprimir_arreglo_secuencias_int(arrint);				
				
				inicio = obtener_inicio_secuencia(arrint, inicio);
				fin = obtener_fin_secuencia(arrint, inicio);
				System.out.println("el inicio de la secuencia es la pos:" + inicio);
				System.out.println("el fin de la secuencia es la pos:" + fin);
			}
			catch(Exception exc){
				System.out.println(exc);
			}
	}
	
	public static void cargar_arreglo_aleatorio_secuencias_int(int []arr){
			Random r = new Random();
			arr[0] = 0;
			arr[MAX-1] = 0;
			for (int pos = 1; pos < MAX-1; pos++){
				if (r.nextDouble()>probabilidad_numero){
					arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
				}
				else{
					arr[pos]=0;
				}
			}
		}
	
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
		System.out.print("\n");
		}
	
	public static int obtener_inicio_secuencia(int[] arr, int inicio){
		while ((inicio < MAX)&&(arr[inicio]==0)){
			inicio++;
		}
		return inicio;
		
	}
	
	public static int obtener_fin_secuencia(int[] arr, int inicio){
		while ((inicio < MAX)&&(arr[inicio]!=0)){
			inicio++;	
		}
		return inicio-1;
	}
	
	public static void cargar_arreglo_int_arbitrario(int[] arr) {

		arr[0] = 0;
		arr[1] = 3;
		arr[2] = 2;
		arr[3] = 1;
		arr[4] = 0;
		arr[5] = 4;
		arr[6] = 7;
		arr[7] = 2;
		arr[8] = 0;
		arr[9] = 9;
		arr[10] = 0;
		arr[11] = 3;
		arr[12] = 6;
		arr[13] = 3;
		arr[14] = 0;
		arr[15] = 4;
		arr[16] = 7;
		arr[17] = 2;
		arr[18] = 0;
		arr[19] = 0;
	}
}