package arreglos;


/*
 * Hacer un programa que dado el arreglo definido y precargado, y un número
entero ingresado por el usuario, elimine las secuencias de tamaño igual al
número ingresado.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class Uno {
public static final int MAX1 = 10;
public static final int MAX2 = 10;
public static final int MAXVALOR = 9;
public static final int MINVALOR = 1;
public static final double probabilidad_letra = 0.4;
public static final double probabilidad_numero = 0.4;

	public static void main(String[] args) {
			
			int [] Arrsec, Modelo, Reemplazo;
			
			
			int Cant = 3;
			Arrsec = new int[MAX1];
			Modelo = new int[MAX2];
			Reemplazo = new int[MAX2];
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try{
				
				System.out.println("Ingrese la cant de la secuencia a reemplazar");
				Cant = Integer.valueOf(entrada.readLine());
				
				Modelo[0] = 1;
				Modelo[1] = 2;
				Modelo[2] = 3;
				Modelo[3] = 0;
				Modelo[4] = 1;
				Modelo[5] = 0;
				
				Reemplazo[0] = 4;
				Reemplazo[1] = 5;
				Reemplazo[2] = 0;
				Reemplazo[3] = 0;
				Reemplazo[4] = 0;
				Reemplazo[5] = 0;
				
				
				cargar_arreglo_aleatorio_secuencias_int(Arrsec);
				System.out.println("Arrsec");
				imprimir_arreglo_secuencias_int(Arrsec);
				
				/*eliminar_secuencia(Arrsec, Reemplazo, Cant);
				imprimir_arreglo_secuencias_int(Arrsec);
				*/
				invertir_mayor_valor_secuencia(Arrsec);
				imprimir_arreglo_secuencias_int(Arrsec);
				
				
			}
			catch(Exception exc){
				System.out.println(exc);
			}
	}
	
	public static void invertir_mayor_valor_secuencia(int[] arr){
		int inicio,fin,suma;
		int inicio_max, fin_max, suma_max;
		inicio = 0;
		fin = -1;
		
		suma_max = 0;
		inicio_max = 0;
		fin_max = 0;
		
		while ((inicio < MAX1)){
			inicio = obtener_inicio_secuencia(arr,fin+1); //REUTILIZAMOS
			if (inicio < MAX1){
				fin = obtener_fin_secuencia(arr,inicio); //REUTILIZAMOS
				suma = obtener_suma_secuencia(arr,inicio,fin);
				System.out.println("La suma de la secuencia de "+inicio+" a "+fin+" es "+suma);
				if (suma > suma_max){
					suma_max = suma;
					inicio_max = inicio;
					fin_max = fin;
				}
			}
		}
		System.out.println("La suma de la secuencia de "+inicio_max+" a "+fin_max+" es "+suma_max + " a invertir");
		invertir_arreglo(arr);
	}
	
	public static void invertir_arreglo(int [] arrint){
		int lastPos = MAX1-1;
		int firstPos;
		for(int i=0 ; i<MAX1/2 ; i++){
			firstPos = arrint[i]; 
			arrint[i] = arrint[lastPos-i]; 
			arrint[lastPos-i] = firstPos;
		}
	}
	
	public static int obtener_suma_secuencia(int[] arr, int inicio, int fin){
		int suma = 0;
		while (inicio <= fin){
			suma+=arr[inicio];
			inicio++;
		}
		return suma;
	}
	
	public static void eliminar_secuencia(int[] arr, int[] arrReemplazo, int Cant){
		int inicio,fin, tamanio_secuencia;
		inicio = 0;
		fin = -1;
			while ((inicio < MAX1)){
				inicio = obtener_inicio_secuencia(arr,fin+1); 
				if (inicio < MAX1){
					fin = obtener_fin_secuencia(arr,inicio);
					tamanio_secuencia = obtener_tamanio_secuencia(arr,inicio,fin);
					System.out.println("El tamanio de la secuencia de "+inicio+" a "+fin+" es "+tamanio_secuencia);
					if (tamanio_secuencia == Cant){
						for (int i = 0; i < Cant; i++) {
							corrimiento_izq(arr, inicio);
							reemplazar(arr, arrReemplazo, inicio, fin);
						}
					}
				}
		}
	}
	
	public static void reemplazar(int arr[], int arrReemplazo[], int inicio, int fin){
		int aux = 0;
		
		for (int i = inicio; i <= fin; i++) {
			arr[i] = arrReemplazo[aux];
			aux++;
			
		}
		aux = 0;
	}
	
	public static void corrimiento_izq(int [] arrint, int indice){
		while (indice < MAX1-1){
			arrint[indice] = arrint[indice+1];
			indice++;
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
		while ((inicio < MAX1)&&(arr[inicio]==0)){
			inicio++;
		}
	return inicio;
}

	public static int obtener_fin_secuencia(int[] arr, int inicio){
	while ((inicio < MAX1)&&(arr[inicio]!=0)){
		inicio++;	
	}
	return inicio-1;
}
	
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX1; pos++){
			System.out.print(arr[pos]+"|");
		}
		System.out.print("\n");
		}
	
	public static void cargar_arreglo_aleatorio_secuencias_int(int []arr){
		Random r = new Random();
		arr[0] = 0;
		arr[MAX1-1] = 0;
		for (int pos = 1; pos < MAX1-1; pos++){
			if (r.nextDouble()>probabilidad_numero){
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			}
			else{
				arr[pos]=0;
			}
		}
	}	
}