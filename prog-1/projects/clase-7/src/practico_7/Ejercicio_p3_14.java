package practico_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio_p3_14 {

	public static final int MAX = 10;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double probabilidad_letra = 0.4;
	public static final double probabilidad_numero = 0.4;

	public static void main(String[] args) {

		int[] arrint;

		int[] arrint2 = new int[MAX];

		arrint2[0] = 0;
		arrint2[1] = 0;
		arrint2[2] = 0;
		arrint2[3] = 0;
		arrint2[4] = 0;
		arrint2[5] = 0;
		arrint2[6] = 0;
		arrint2[7] = 0;
		arrint2[8] = 0;
		arrint2[9] = 0;

		int longSecACopiar;
		arrint = new int[MAX];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese el tamanio de la sec que quiere fletar");
			longSecACopiar = Integer.valueOf(entrada.readLine());

			cargar_arreglo_aleatorio_secuencias_int(arrint);

			imprimir_arreglo_secuencias_int(arrint);

			imprimir_tamanio_cada_secuencia(arrint, arrint2, longSecACopiar);

		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

	public static void imprimir_tamanio_cada_secuencia(int[] arr, int[] arrint2, int longSecACopiar) {

		int fin, inicio, tamanio_secuencia;
		inicio = 0;
		fin = -1;

		while ((inicio < MAX)) {
			inicio = obtener_inicio_secuencia(arr, fin + 1); // REUTILIZAMOS
			if (inicio < MAX) {
				fin = obtener_fin_secuencia(arr, inicio); // REUTILIZAMOS
				tamanio_secuencia = obtener_tamanio_secuencia(arr, inicio, fin);
//				System.out
//						.println("El tamanio de la secuencia de " + inicio + " a " + fin + " es " + tamanio_secuencia);
				if (tamanio_secuencia == longSecACopiar) {
					copiarSecAOtroArreglo(arr, arrint2, inicio, fin);
				}

			}
		}
	}

	public static int obtener_tamanio_secuencia(int[] arr, int inicio, int fin) {
		int tamanio = 0;
		while (inicio <= fin) {
			tamanio++;
			inicio++;
		}
		return tamanio;
	}

	public static int obtener_inicio_secuencia(int[] arr, int inicio) {
		while ((inicio < MAX) && (arr[inicio] == 0)) {
			inicio++;
		}
		return inicio;
	}

	public static int obtener_fin_secuencia(int[] arr, int inicio) {
		while ((inicio < MAX) && (arr[inicio] != 0)) {
			inicio++;
		}
		return inicio - 1;
	}

	public static void imprimir_arreglo_secuencias_int(int[] arr) {
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++) {
			System.out.print(arr[pos] + "|");
		}
		System.out.print("\n");
	}

	public static void cargar_arreglo_aleatorio_secuencias_int(int[] arr) {
		Random r = new Random();
		arr[0] = 0;
		arr[MAX - 1] = 0;
		for (int pos = 1; pos < MAX - 1; pos++) {
			if (r.nextDouble() > probabilidad_numero) {
				arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
			} else {
				arr[pos] = 0;
			}
		}
	}

	public static void copiarSecAOtroArreglo(int[] arrint, int[] arrint2, int inicio, int fin) {

		int inicioArr2;

		int tam = 0;
		inicioArr2 = 1;
		imprimir_arreglo_secuencias_int(arrint2);
		tam = obtener_tamanio_secuencia(arrint, inicio, fin);
		for (int i = 0; i <= tam; i++) {
			arrint2[inicioArr2 + i] = arrint[inicio + i];
		}
		imprimir_arreglo_secuencias_int(arrint2);
	}

}