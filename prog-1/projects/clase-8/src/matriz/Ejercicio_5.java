package matriz;
/*
 * Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, solicite al usuario un numero entero y elimine la primer ocurrencia de numero
en la matriz (un número igual) si existe. Para ello tendrá que buscar la posición y si está,
realizar un corrimiento a izquierda y no continuar buscando.
 */
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

	public class Ejercicio_5 {
		public static final int MAXFILA = 5;
		public static final int MAXCOLUMNA = 10;
		public static final int MAXVALOR = 9;
		public static final int MINVALOR = 1;
		
		public static void main(String[] args) {
			int buscado;
			int [][] matint;
			matint = new int[MAXFILA][MAXCOLUMNA];
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try{
				cargar_matriz_int(matint);
				imprimir_matriz_int(matint);
				System.out.println("Ingrese un valor que quiera buscar y eliminar");
				buscado = Integer.valueOf(entrada.readLine());
				corrimiento_izq_mat(matint, buscado);
				imprimir_matriz_int(matint);
			}
			catch (Exception exc){
				System.out.println(exc);
			}
		}
		
		public static void corrimiento_izq_mat(int [][] mat, int buscado){
			
			for (int fila = 0; fila < MAXFILA; fila++) {
				seekAndDestroy(mat[fila], buscado);
				
			}
		}
		public static void seekAndDestroy(int [] arrint, int buscado){
			
			for (int pos = 0; pos < MAXCOLUMNA; pos++) {
				if (arrint[pos] == buscado){
					System.out.println("A eliminar la pos" + pos);
					corrimiento_izq(arrint, pos);;
				}
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
	