package parcial;

/*
 * Hacer un programa que dado un arreglo ordenado creciente de enteros
de tama�o 10 que se encuentra precargado, solicite al usuario un numero
entero y lo inserte en el arreglo manteniendo su orden. Para ello tendr�
que realizar un corrimiento a derecha (se pierde el �ltimo valor del arreglo)
y colocar el numero en el arreglo en la posici�n indicada.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Parcial2 {
	public static final int MAX = 7;
	public static final int MAXVALOR = 10;
	public static final int MAXVALORP = 6;
	public static final int MINVALOR = 1;

	public static void main(String[] args) {

		int[] A = new int[MAX];
		int[] P = new int[6];

		try {

			cargar_arreglo_int_arbitrario(A, P);
			imprimir_arreglo_int(A);

			System.out.println("arreglo de mi única secuencia");
			imprimir_arreglo_int_P(P);

			reemplazar_secuencias(A, P);
			System.out.println("Resultado");
			imprimir_arreglo_int(A);

			// corrimiento_izq(arrint, pos);
			// corrimiento_izq(arrint, pos);

			// corrimiento_der(arrint, pos);
			// corrimiento_der(arrint, pos);
			// corrimiento_der(arrint, pos);

			// corrimiento_izq(arrint, pos);

			// insertarOrdenado(arrint, val, pos);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

	public static void reemplazar_secuencias(int[] A, int[] P) {
		int inicio, fin;
		int inicioP, finP, valorP, tamSecP;

		inicio = 1;
		fin = 2;

		inicioP = 2; // obtenerInicioSec(P, inicioP);
		finP = 4;// obtenerFinP(P, inicioP) + 1;
		tamSecP = finP - inicioP + 1;
		valorP = 16;// SumarValorSec();

		eliminarSec(A, inicio, fin);
		insertarSec(A, inicio, P, inicioP, finP);
	}

	public static void insertarSec(int[] A, int inicio, int[] sec, int inicioSec, int finSec) {
		
		int indice, tamSec;
		indice = 0;
		tamSec = finSec - inicioSec + 1;
		
		System.out.println("HACIENDING ESPACIO: " + tamSec );
		while (indice < tamSec) {
			corrimiento_der(A, inicio);
			indice ++;
		}
		
		System.out.println("COMIENZO A COPIAR LA SECUENCIA");
		copiarSec(A, inicio , sec, inicioSec, finSec);
		
		A[MAX - 1] = 0; 
		
				
	};
	
	public static void copiarSec(int[] A, int inicio , int[] sec, int inicioSec, int finSec){ 
		
		int indice, tamSec;
		tamSec = finSec - inicioSec + 1;
		indice = 0;
		
		while(indice < tamSec) {
			A[inicio + indice] = sec[inicioSec + indice];
			indice++;
		}
	};
	
	public static void eliminarSec(int[] arr, int inicio, int fin) {
		int indice, tam;
		tam = fin - inicio + 1;
		indice = 0;
		while (indice < tam) {
			corrimiento_izq(arr, inicio);
			indice++;
		}
	}
	
	public static void corrimiento_izq(int[] arrint, int minPos) {

		while (minPos < MAX - 1) {
			arrint[minPos] = arrint[minPos + 1];
			minPos++;
		}
	}

	// carga de arreglo de int con valores de MINVALOR a MAXVALOR
	public static void cargar_arreglo_aleatorio_int(int[] arr) {

		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++) {
			arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
		}
	}

	public static void imprimir_arreglo_int(int[] arr) {

		for (int pos = 0; pos < MAX; pos++) {
			System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
		}
	}

	public static void imprimir_arreglo_int_P(int[] arr) {

		for (int pos = 0; pos < MAXVALORP; pos++) {
			System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
		}
	}

	public static void corrimiento_der(int[] arrint, int pos) {

		int indice = MAX - 1;
		while (indice > pos) {
			arrint[indice] = arrint[indice - 1];
			indice--;
		}
	}

	

	public static int buscar_pos_arr_ordenado_creciente(int[] arr, int val) {

		int i = 0;
		while ((i < MAX - 1) && (arr[i] < val)) {
			i++;
		}
		System.out.println("Posicion del valor encontrada: " + i);
		return i;
	}

	public static void insertarOrdenado(int[] arr, int val, int pos) {
		arr[pos] = val;
	}

	public static void cargar_arreglo_int_arbitrario(int[] arr, int[] p) {

		arr[0] = 0;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 0;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
//		arr[7] = 0;
//		arr[8] = 6;
//		arr[9] = 5;
//		arr[10] = 4;
//		arr[11] = 1;
//		arr[12] = 0;
//		arr[13] = 41;
//		arr[14] = 5;
//		arr[15] = 0;
//		arr[16] = 3;
//		arr[17] = 2;
//		arr[18] = 0;

		p[0] = 0;
		p[1] = 0;
		p[2] = 3;
		p[3] = 8;
		p[4] = 5;
		p[5] = 0;
	}
}