package practico_7;

/*
Hacer un programa que dado un arreglo ordenado creciente de enteros
de tama�o 10 que se encuentra precargado, solicite al usuario un numero
entero y elimine la primer ocurrencia de numero (un n�mero igual) en el
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

		int valAEliminar = -1;
		int posAEliminar = -1;
		int[] arrint = new int[MAX];

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un entero del 0 al - " + (MAXVALOR - 1));
			valAEliminar = Integer.valueOf(entrada.readLine());
			cargar_arreglo_int_arbitrario(arrint);
			imprimir_arreglo_int(arrint);
			
			posAEliminar = buscar_pos_arr_ord_crec(arrint, valAEliminar);
			
			borrarValor(arrint, posAEliminar, valAEliminar);
			imprimir_arreglo_int(arrint);
			
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

	public static void cargar_arreglo_int_arbitrario(int[] arr) {

		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 5;
		arr[3] = 7;
		arr[4] = 9;
		arr[5] = 11;
		arr[6] = 13;
		arr[7] = 15;
		arr[8] = 16;
		arr[9] = 17;
	}

	public static void imprimir_arreglo_int(int[] arr) {

		for (int pos = 0; pos < MAX; pos++) {
			System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
		}
	}

	public static int buscar_pos_arr_ord_crec(int[] arr, int numero) {
		int posicion = 0;
		while ((posicion < MAX - 1) && (arr[posicion] < numero)) {
			posicion++;
		}
		System.out.println("La posicion de " + numero + " es: " + posicion);
		return posicion;
	}
	
	public static void borrarValor(int[] arr, int pos, int valorAEliminar) {
		//Encontró un valor a eliminar
		if (arr[pos] == valorAEliminar) {
			//Pregunto si es el último lugar. Requiere corrimiento hacia la derecha, elimina el último valor.
			if (pos == MAX - 1) { 
				corrimiento_der(arr);
			} else {
				corrimiento_izq(arr, pos);
				System.out.println("Se elimino el valor: " + valorAEliminar);
			}
		} else {
			System.out.println("El valor: " + valorAEliminar + " no existe, no se elimino");
		}
	}

	public static void corrimiento_izq(int[] arrint, int minPos) {

		while (minPos < MAX - 1) {
			arrint[minPos] = arrint[minPos + 1];
			minPos++;
		}
	}
	
	public static void corrimiento_der(int [] arrint){
		int indice = MAX-1;
		while (indice > MINVALOR-1){
			arrint[indice] = arrint[indice-1];
			indice--;
		}
	}
}
