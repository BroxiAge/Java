package matriz;
/*
 * Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, solicite al usuario un numero entero y una posición fila, columna. Con estos
datos tendrá que realizar un corrimiento a derecha (se pierde el último valor en dicha fila)
y colocar el numero en la matriz en la posición fila, columna indicada.
 */
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

	public class Ejercicio_4 {
		public static final int MAXFILA = 5;
		public static final int MAXCOLUMNA = 10;
		public static final int MAXVALOR = 9;
		public static final int MINVALOR = 1;
		
		public static void main(String[] args) {
			int pos_fila = 0;
			int pos_columna = 0;
			int val1 = 0;
			int [][] matint;
			matint = new int[MAXFILA][MAXCOLUMNA];
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try{
				cargar_matriz_int(matint);
				imprimir_matriz_int(matint);
				System.out.println("Ingrese un valor de la fila entre: 0 - " + (MAXFILA-1));
				pos_fila = Integer.valueOf(entrada.readLine());
				System.out.println("Ingrese un valor de la la columna entre: 0- " + (MAXCOLUMNA-1));
				pos_columna = Integer.valueOf(entrada.readLine());
				System.out.println("Ingrese un valor entero para reemplazar.");
				val1 = Integer.valueOf(entrada.readLine());
				corrimiento_der_mat(matint, pos_fila, pos_columna, val1);
				imprimir_matriz_int(matint);
				
			}
			catch (Exception exc){
				System.out.println(exc);
			}
			
		}
		
		
		public static void corrimiento_der_mat(int [][] mat, int fila, int columna, int val1){
			if ((0<=fila)&&(fila < MAXFILA)&&(0<=columna)&&(columna < MAXCOLUMNA)){
				corrimiento_der_fila_columna(mat[fila], columna, val1);
			}
			else{
				System.out.println("Se fue de rango, no se hizo nada.");
			}
			
		}
		
		public static void corrimiento_der_fila_columna(int [] arrint, int pos, int val1){
			int indice = MAXCOLUMNA-1;
			while (indice > pos){
				arrint[indice] = arrint[indice-1];
				indice--;
				}
			arrint[pos] = val1; //inserto el valor
			
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
	