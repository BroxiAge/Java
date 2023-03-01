package practico_7;
/* Hacer un programa que dado el arreglo definido y precargado permita encontrar la
posición de inicio de la anteúltima secuencia (considerar comenzar a buscarla a
partir de la ultima posición del arreglo). */

public class Ejercicio_12 {

	public static final int MAX = 10;
	public static final int MIN = 1;

	public static void main(String[] args) {

		int[] arrint;
		arrint = new int[MAX];

		try {
			cargar_arreglo_int_arbitrario(arrint);
			imprimir_arreglo_secuencias_int(arrint);
			encontrar_anteultima_secuencia_fila(arrint);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void cargar_arreglo_int_arbitrario(int[] arr) {

		arr[0] = 0;
		arr[1] = 3;
		arr[2] = 2;
		arr[3] = 0;
		arr[4] = 4;
		arr[5] = 5; // 5
		arr[6] = 0; // 6
		arr[7] = 9;
		arr[8] = 1;
		arr[9] = 0;
	}

	public static void imprimir_arreglo_secuencias_int(int[] arr) {
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++) {
			System.out.print(arr[pos] + "|");
		}

		System.out.print("\n");
	}

	public static void encontrar_anteultima_secuencia_fila(int[] arrint) {
		int inicio, fin;
		int inicio2, fin2;

		fin = encontrar_fin_inverso(arrint, MAX - 1);
		 System.out.println(fin);
		inicio = encontrar_inicio_inverso(arrint, fin);
		 System.out.println(inicio+1);

		fin2 = encontrar_fin_inverso(arrint, inicio);
		System.out.println("Este es el fin: " + fin2);
		
		inicio2 = encontrar_inicio_inverso(arrint, fin2);
		System.out.println("Este es el inicio: " + (inicio2 + 1));

	}

	public static int encontrar_fin_inverso(int[] arrint, int fin) {

		while ((arrint[fin] == 0) && (fin > 0)) {
			fin--;
		}
		return fin;
	}

	public static int encontrar_inicio_inverso(int[] arrint, int fin) {

		while ((arrint[fin] != 0) && (fin > 0)) {
			fin--;
		}

		return fin;
	}

}
