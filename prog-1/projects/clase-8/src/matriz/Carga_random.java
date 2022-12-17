package matriz;

import java.util.Random;

	public class Carga_random {
		public static final int MAXFILA = 4;
		public static final int MAXCOLUMNA = 5;
		public static final int MAXVALOR = 9;
		public static final int MINVALOR = 1;
		
		public static void main(String[] args) {
			int [][] matint;
			matint = new int[MAXFILA][MAXCOLUMNA];
			
			cargar_matriz_int(matint);
			imprimir_matriz_int(matint);
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
}
	