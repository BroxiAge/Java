package matriz;
/*
 * Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, obtenga la cantidad de números pares que tiene y la imprima.
 */
import java.util.Random;

	public class Ejercicio_2 {
		public static final int MAXFILA = 5;
		public static final int MAXCOLUMNA = 10;
		public static final int MAXVALOR = 9;
		public static final int MINVALOR = 1;
		
		public static void main(String[] args) {
			int [][] matint;
			matint = new int[MAXFILA][MAXCOLUMNA];
			
			cargar_matriz_int(matint);
			imprimir_matriz_int(matint);
			seekPairMat(matint);
		}
		
		public static void cargar_matriz_int(int [][] mat){
			for (int fila = 0; fila < MAXFILA; fila++) {
				cargar_arreglo_aleatorio_int(mat[fila]);
				
			}
		}
		
		public static void cargar_arreglo_aleatorio_int(int [] arr){
			Random r = new Random();
			for (int pos = 0; pos < MAXCOLUMNA; pos++){
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
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

		public static void seekPairMat (int [] [] mat){
			int cant_par_mat = 0;
			
			for (int fila = 0; fila < MAXFILA; fila++) {
				cant_par_mat = cant_par_mat + seekPairArr(mat[fila]);
				}
			System.out.println("La cant de numeros par de la MATRIZ es: " + cant_par_mat);
		}
		
		public static int seekPairArr(int[] arr){
			int cant_par_arr = 0;
			
			for (int i = 0; i < MAXCOLUMNA; i++) {
				if(arr[i] % 2 == 0 ){
					cant_par_arr++;
				}
			}
		return cant_par_arr;
		}
}
	