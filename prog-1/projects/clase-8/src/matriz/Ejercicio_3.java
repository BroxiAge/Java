package matriz;
/*
 * Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, solicite al usuario una posición fila, columna y realice un corrimiento a
izquierda.
 */
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

	public class Ejercicio_3 {
		public static final int MAXFILA = 5;
		public static final int MAXCOLUMNA = 10;
		public static final int MAXVALOR = 9;
		public static final int MINVALOR = 1;
		
		public static void main(String[] args) {
			int pos_fila = 0;
			int pos_columna = 0;
			int [][] matint;
			matint = new int[MAXFILA][MAXCOLUMNA];
			
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try{
				cargar_matriz_int(matint);
				imprimir_matriz_int(matint);
				System.out.println("Ingrese un valor de la fila entre: 0- " + (MAXFILA-1));
				pos_fila = Integer.valueOf(entrada.readLine());
				System.out.println("Ingrese un valor de la la columna entre: 0- " + (MAXCOLUMNA-1));
				pos_columna = Integer.valueOf(entrada.readLine());
				corrimiento_izq_mat(matint, pos_fila, pos_columna);
				imprimir_matriz_int(matint);
				
			}
			catch (Exception exc){
				System.out.println(exc);
			}
			
		}
		
		public static void corrimiento_izq_mat(int [][] mat, int fila, int columna){
			
			if (((0<= fila) && (fila < MAXFILA)) && ((0<= columna) && (columna < MAXCOLUMNA))){
				corrimiento_izq(mat[fila], columna);
			}
			else{
				System.out.println("Se ha salido de rango");
			}
			
		}
		
		public static void corrimiento_izq(int [] arrint, int indice){
			
			while (indice < MAXCOLUMNA-1){
				arrint[indice] = arrint[indice+1];
				indice++;
			}
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
	