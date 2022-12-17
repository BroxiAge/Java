package parte_3;

	import java.util.Random;
/*
 * Hacer un programa que dada la matriz de secuencias de enteros definida y
precargada permita encontrar por cada fila la posición de inicio y fin de la
secuencia cuya suma de valores sea mayor.
 */
	public class Ejercicio_11 {
		
			public static final int MAXFILA = 4;
			public static final int MAXCOLUMNA = 10;
			public static final int MAXVALOR = 9;
			public static final int MINVALOR = 1;
			public static final double probabilidad_numero = 0.4;
			
			public static void main(String[] args) {
				int [][] matint;
				matint = new int[MAXFILA][MAXCOLUMNA];
				
				cargar_matriz_int(matint);
				imprimir_matriz_int(matint);
				mat_encontrar_mayor_valor_cada_fila(matint);
				
			}
			public static void mat_encontrar_mayor_valor_cada_fila(int[][] matint){
				for (int fila = 0; fila < MAXFILA; fila++) {
					imprimir_suma_cada_secuencia(matint[fila]);
					
				}
			}
			
			public static void imprimir_suma_cada_secuencia(int[] arr){
				int inicio,fin,suma, suma_comparativa;
				suma_comparativa = 0;
				inicio = 0;
				fin = -1;
				while ((inicio < MAXCOLUMNA)){
					inicio = obtener_inicio_secuencia(arr,fin+1); //REUTILIZAMOS
					if (inicio < MAXCOLUMNA){
						fin = obtener_fin_secuencia(arr,inicio); //REUTILIZAMOS
						suma = obtener_suma_secuencia(arr,inicio,fin);
						if (suma > suma_comparativa){
							suma_comparativa = suma;
						}
					}
				}
				System.out.println("La suma mayor de la fila: " + suma_comparativa);
			}
			
			public static int obtener_suma_secuencia(int[] arr, int inicio, int fin){
				int suma = 0;
				while (inicio <= fin){
					suma+=arr[inicio];
					inicio++;
				}
				return suma;
			}

		//Obtener INICIO secuencia

		public static int obtener_inicio_secuencia(int[] arr, int inicio){
				while ((inicio < MAXCOLUMNA)&&(arr[inicio]==0)){
					inicio++;
				}
				return inicio;
				
			}

		//Obtener FIN secuencia

		public static int obtener_fin_secuencia(int[] arr, int inicio){
				while ((inicio < MAXCOLUMNA)&&(arr[inicio]!=0)){
					inicio++;	
				}
				return inicio-1;
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
		