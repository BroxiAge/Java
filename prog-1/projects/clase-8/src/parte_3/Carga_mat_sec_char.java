package parte_3;

		import java.util.Random;
	
		public class Carga_mat_sec_char {
		public static final int MAXFILA = 4;
		public static final int MAXCOLUMNA = 10;
		public static final int MAXVALOR = 9;
		public static final int MINVALOR = 1;
		public static final double probabilidad_letra = 0.4;
				
		public static void main(String[] args) {
			char [][] matchar;
			matchar = new char[MAXFILA][MAXCOLUMNA];
					
			cargar_matriz_aleatorio_secuencias_char(matchar);
			imprimir_matriz_char(matchar);
		}
				
		public static void cargar_matriz_aleatorio_secuencias_char(char[][] mat){
			for (int fila = 0; fila < MAXFILA; fila++){
				cargar_arreglo_aleatorio_secuencias_char(mat[fila]);
			}
			System.out.println("");
		}
		
		public static void cargar_arreglo_aleatorio_secuencias_char(char[] arr){
		Random r = new Random();
		arr[0] = ' ';
		arr[MAXCOLUMNA-1] = ' ';
			for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
				if (r.nextDouble()>probabilidad_letra){
					arr[pos]=(char)(r.nextInt(26) + 'a');
				}
					else{
						arr[pos]=' ';
					}
			}
		}
				
		public static void imprimir_matriz_char(char [][] mat){
			for (int fila = 0; fila < MAXFILA; fila++){
			imprimir_arreglo_secuencias_char(mat[fila]);
				System.out.println("");
			}
		}
				
		public static void imprimir_arreglo_secuencias_char(char [] arr){
			System.out.print("Arreglo de secuencias char\n|");
				for (int pos = 0; pos < MAXCOLUMNA; pos++){
						System.out.print(arr[pos]+"|");
				}
			System.out.print("\n");
		}
	}
			