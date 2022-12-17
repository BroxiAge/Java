package matriz;
/*
 * Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, invierta el orden del contenido por fila. Este intercambio no se debe realizar
de manera explícita, hay que hacer un método que incluya una iteración de intercambio.
 */
import java.util.Random;

	public class Ejercicio_1 {
		public static final int MAXFILA = 5;
		public static final int MAXCOLUMNA = 10;
		public static final int MAXVALOR = 9;
		public static final int MINVALOR = 1;
		
		public static void main(String[] args) {
			int [][] matint;
			matint = new int[MAXFILA][MAXCOLUMNA];
			
			cargar_matriz_int(matint);
			imprimir_matriz_int(matint);
			System.out.println("asd");
			invertir_matriz(matint);
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
		
		public static void invertir_matriz(int [][] mat){
			
			for (int fila = 0; fila < MAXFILA; fila++) {
				invertir_arreglo(mat[fila]);
				
			}
		}
		
		public static void invertir_arreglo(int [] arrint){
			int lastPos = MAXCOLUMNA-1;
			int firstPos;
			for(int i=0 ; i<MAXCOLUMNA/2 ; i++){
				firstPos = arrint[i]; 
				arrint[i] = arrint[lastPos-i]; 
				arrint[lastPos-i] = firstPos;
			}
		}
}