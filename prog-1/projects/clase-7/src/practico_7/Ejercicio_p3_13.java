package practico_7;
/*
 * Hacer un programa que dado el arreglo definido y precargado, y un n�mero
entero ingresado por el usuario, elimine las secuencias de tama�o igual al
n�mero ingresado.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class Ejercicio_p3_13 {
public static final int MAX = 10;
public static final int MAXVALOR = 9;
public static final int MINVALOR = 1;
public static final double probabilidad_letra = 0.4;
public static final double probabilidad_numero = 0.4;

	public static void main(String[] args) {
			
			int [] arrint;
			
			
			int tamanio;
			arrint = new int[MAX];
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try{
				System.out.println("Ingrese el tamanio de la sec que quiere fletar");
				tamanio = Integer.valueOf(entrada.readLine());
				/*
				arrint[0] = 0;
				arrint[1] = 1;
				arrint[2] = 2;
				arrint[3] = 0;
				arrint[4] = 1;
				arrint[5] = 3;
				arrint[6] = 3;
				arrint[7] = 1;
				arrint[8] = 2;
				arrint[9] = 0;
				*/
				cargar_arreglo_aleatorio_secuencias_int(arrint);
				imprimir_arreglo_secuencias_int(arrint);
				eliminar_todas_secuencias_por_tamanio(arrint, tamanio);
				imprimir_arreglo_secuencias_int(arrint);
				

			}
			catch(Exception exc){
				System.out.println(exc);
			}
	}
	public static void eliminar_todas_secuencias_por_tamanio(int[] arr, int tamanio){
		int inicio = 0;
		for (int i = 0; i < MAX; i++) {
			eliminar_secuencia_por_tamanio(arr, tamanio, inicio);
		}
	}
	
	public static void eliminar_secuencia_por_tamanio(int[] arr, int tamanio, int inicio){
		int fin,tamanio_secuencia;
		fin = -1;
		while ((inicio < MAX)){
			inicio = obtener_inicio_secuencia(arr,fin+1); //REUTILIZAMOS
				if (inicio < MAX){
					fin = obtener_fin_secuencia(arr,inicio); //REUTILIZAMOS
					tamanio_secuencia = obtener_tamanio_secuencia(arr,inicio,fin);
					System.out.println("El tamanio de la secuencia de "+inicio+" a "+fin+" es "+tamanio_secuencia);
					if (tamanio_secuencia == tamanio){
						for (int i = 0; i < tamanio; i++) {
							corrimiento_izq(arr, inicio);
						}
					}
				}
		}
	}
		public static int obtener_tamanio_secuencia(int[] arr, int inicio, int fin){
		int tamanio = 0;
		while (inicio <= fin){
			tamanio++;
			inicio++;
		}
		return tamanio;
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
	
	public static void corrimiento_izq(int [] arrint, int indice){
		while (indice < MAX-1){
			arrint[indice] = arrint[indice+1];
			indice++;
		}
	}
	
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
		System.out.print("\n");
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
}