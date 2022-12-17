package practico_7;
/*
Hacer un programa que dado un arreglo ordenado creciente de enteros
de tamaño 10 que se encuentra precargado, solicite al usuario un numero
entero y elimine la primer ocurrencia de numero (un número igual) en el
arreglo si existe.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio_8 {	
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	
	public static void main(String[] args) {
		
		int val1 = -1;
		int [] arrint= new int [MAX];
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un entero del 0 al - " + (MAXVALOR-1));
			val1 = Integer.valueOf(entrada.readLine());
			cargar_arreglo_aleatorio_int(arrint);
			ordenar_arreglo_burbujeo(arrint);
			imprimir_arreglo_int(arrint);
			
			val1 = obtener_pos_arreglo(arrint, val1);
			if (val1 != -1){
				System.out.println("La posicion del valor es:" + val1 );
				corrimiento_izq(arrint, val1);
				imprimir_arreglo_int(arrint);
			}
			else{
				System.out.println("El valor ingresado doesn't exist in this arraydea");
			}
			
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	//carga de arreglo de int con valores de MINVALOR a MAXVALOR
	public static void cargar_arreglo_aleatorio_int(int [] arr){
		
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
		
	public static void imprimir_arreglo_int(int [] arr){
		
		for (int pos = 0; pos < MAX; pos++){
		System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}
	
	public static void ordenar_arreglo_burbujeo(int[] arr){
		int temp;
		for(int i = 1;i < MAX;i++){
			for (int j = 0 ; j < MAX - 1; j++){
				if (arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static int obtener_pos_arreglo(int [] arr, int numero){
		int posicion = 0;
		while ((posicion < MAX) && (arr[posicion] != numero)){
			posicion++;
		}
		if (posicion != 10){
			return posicion;
		}else{
			posicion = -1;
			return posicion;
		}
	}
	
	public static void corrimiento_izq(int [] arrint, int minPos){
		
		
		while (minPos < MAX-1){
			arrint[minPos] = arrint[minPos+1];
			minPos++;
		}
	}
	
}
