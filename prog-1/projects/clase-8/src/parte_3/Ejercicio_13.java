package parte_3;
/*Hacer un programa que dada la matriz de secuencias de enteros definida y
precargada, y un número entero ingresado por el usuario, elimine de cada fila
las secuencias de tamaño igual al número ingresado.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
	
	public class Ejercicio_13 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 10;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double probabilidad_numero = 0.4;
			
	public static void main(String[] args) {
		int [][] matint;
		matint = new int[MAXFILA][MAXCOLUMNA];
		
		int tamanio;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese el tamanio de la sec que quiere fletar");
			tamanio = Integer.valueOf(entrada.readLine());
			cargar_matriz_int(matint);
			imprimir_matriz_int(matint);
			System.out.println("--");
			mat_eliminar_todas_secuencias_por_tamanio(matint, tamanio);
			imprimir_matriz_int(matint);

		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	
	public static void mat_eliminar_todas_secuencias_por_tamanio(int[][] matint, int tamanio){
		
		for (int fila = 0; fila < MAXFILA; fila++) {
			eliminar_todas_secuencias_por_tamanio(matint[fila], tamanio);
		}
	}
	
	public static void eliminar_todas_secuencias_por_tamanio(int[] arr, int tamanio){
		
		int inicio = 0;
		for (int i = 0; i < MAXCOLUMNA; i++) {
			eliminar_secuencia_por_tamanio(arr, tamanio, inicio);
		}
	}
	
	public static void eliminar_secuencia_por_tamanio(int[] arr, int tamanio, int inicio){
		int fin,tamanio_secuencia;
		fin = -1;
		while ((inicio < MAXCOLUMNA)){
			inicio = obtener_inicio_secuencia(arr,fin+1); //REUTILIZAMOS
				if (inicio < MAXCOLUMNA){
					fin = obtener_fin_secuencia(arr,inicio); //REUTILIZAMOS
					tamanio_secuencia = obtener_tamanio_secuencia(arr,inicio,fin);
					//System.out.println("El tamanio de la secuencia de "+inicio+" a "+fin+" es "+tamanio_secuencia);
					if (tamanio_secuencia == tamanio){
						for (int i = 0; i < tamanio; i++) {
							corrimiento_izq(arr, inicio);
							System.out.println("Se eliminio: " + inicio + " hasta " + fin);
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
		while ((inicio < MAXCOLUMNA)&&(arr[inicio]==0)){
			inicio++;
		}
		return inicio;
	}
	
	public static int obtener_fin_secuencia(int[] arr, int inicio){
		while ((inicio < MAXCOLUMNA)&&(arr[inicio]!=0)){
			inicio++;	
		}
		return inicio-1;
	}
	
	public static void corrimiento_izq(int [] arrint, int indice){
		while (indice < MAXCOLUMNA-1){
			arrint[indice] = arrint[indice+1];
			indice++;
		}
	}
			
	public static void cargar_matriz_int(int [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++) {
			cargar_arreglo_secuencia_int(mat[fila]);
		}
	}
			
	public static void cargar_arreglo_secuencia_int(int []arr){
		Random r = new Random();
		arr[0] = 0;
		arr[MAXCOLUMNA-1] = 0;
		for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
			if (r.nextDouble()>probabilidad_numero){
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			}
			else{
				arr[pos]=0;
			}
		}
	}
			
	public static void imprimir_matriz_int (int [] [] mat){
		for (int fila = 0; fila < MAXFILA; fila++) {
			imprimir_arreglo_int(mat[fila]);
			System.out.println(" ");
		}
	}
			
	public static void imprimir_arreglo_int(int [] arr){
		for (int pos = 0; pos < MAXCOLUMNA; pos++){
			System.out.print("|" + arr[pos] + "|");
		}
	}
}		