package parte_3;

		import java.util.Random;
	
		public class Carga_mat_sec {
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
			