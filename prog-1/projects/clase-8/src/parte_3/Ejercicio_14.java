package parte_3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * Hacer un programa que dada la matriz de secuencias de caracteres definida y
precargada, elimine de cada fila todas las ocurrencias de una secuencia
patrón dada por un arreglo de caracteres de tamaño igual al tamaño de
columnas de la matriz (solo tiene esa secuencia con separadores al inicio y al
final). Al eliminar en cada fila se pierden los valores haciendo los corrimientos.
 */
		import java.util.Random;
	
		public class Ejercicio_14 {
		public static final int MAXFILA = 5;
		public static final int MAXCOLUMNA = 10;
		public static final int MAXVALOR = 9;
		public static final int MINVALOR = 1;
		public static final double probabilidad_letra = 0.4;
				
		public static void main(String[] args) {
			char [][] matchar;
			char [] arrchar;
			matchar = new char[MAXFILA][MAXCOLUMNA];
			arrchar = new char[MAXCOLUMNA];
			
			//char caracter;
			
			//BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try{
				
				arrchar[0] = ' ';
				arrchar[1] = 'a';
				arrchar[2] = 'a';
				arrchar[3] = ' ';
				arrchar[4] = ' ';
				arrchar[5] = ' ';
				arrchar[6] = ' ';
				arrchar[7] = ' ';
				arrchar[8] = ' ';
				arrchar[9] = ' ';
				
				matchar[0][0] = ' ';
				matchar[0][1] = 'a';
				matchar[0][2] = 'a';
				matchar[0][3] = ' ';
				matchar[0][4] = ' ';
				matchar[0][5] = ' ';
				matchar[0][6] = ' ';
				matchar[0][7] = ' ';
				matchar[0][8] = ' ';
				matchar[0][9] = ' ';
				
				matchar[1][0] = ' ';
				matchar[1][1] = ' ';
				matchar[1][2] = ' ';
				matchar[1][3] = ' ';
				matchar[1][4] = 'a';
				matchar[1][5] = 'a';
				matchar[1][6] = ' ';
				matchar[1][7] = ' ';
				matchar[1][8] = ' ';
				matchar[1][9] = ' ';
				
				matchar[2][0] = ' ';
				matchar[2][1] = ' ';
				matchar[2][2] = ' ';
				matchar[2][3] = ' ';
				matchar[2][4] = ' ';
				matchar[2][5] = ' ';
				matchar[2][6] = ' ';
				matchar[2][7] = 'a';
				matchar[2][8] = 'a';
				matchar[2][9] = ' ';
				
				matchar[3][0] = ' ';
				matchar[3][1] = 'a';
				matchar[3][2] = 'a';
				matchar[3][3] = ' ';
				matchar[3][4] = ' ';
				matchar[3][5] = ' ';
				matchar[3][6] = ' ';
				matchar[3][7] = ' ';
				matchar[3][8] = ' ';
				matchar[3][9] = ' ';
				
				matchar[4][0] = ' ';
				matchar[4][1] = ' ';
				matchar[4][2] = ' ';
				matchar[4][3] = ' ';
				matchar[4][4] = 'a';
				matchar[4][5] = 'a';
				matchar[4][6] = ' ';
				matchar[4][7] = ' ';
				matchar[4][8] = ' ';
				matchar[4][9] = ' ';
				
				imprimir_matriz_char(matchar);
				mat_eliminar_todas_secuencias_por_tamanio(matchar, arrchar);
				//System.out.println("Ingrese un caracter :");
				//cargar_matriz_aleatorio_secuencias_char(matchar);
				//imprimir_arreglo_secuencias_char(arrchar);
				//caracter = entrada.readLine().charAt(0);
			}
			catch(Exception exc){
				System.out.println(exc);
			}
		}
		
		public static void mat_eliminar_todas_secuencias_por_tamanio(char [][] matchar, char [] arrchar){
			int inicio_modelo, fin_modelo, tamanio_modelo;
			
			inicio_modelo = 0;
	        fin_modelo = -1;
	        tamanio_modelo = 0;
	        
	        inicio_modelo =obtener_inicio_secuencia(arrchar, fin_modelo + 1);
	        System.out.println("inicio del modelo " + inicio_modelo);
	        fin_modelo = obtener_fin_secuencia(arrchar, inicio_modelo);
	        System.out.println("fin del modelo " + fin_modelo);
	        tamanio_modelo = obtener_tamanio_secuencia(arrchar, inicio_modelo, fin_modelo);
	        System.out.println("tamanio de la secuencia del modelo " + tamanio_modelo);
			
			for (int fila = 0; fila < MAXFILA; fila++) {
				buscar_secuencia_char(matchar[fila], arrchar, inicio_modelo, fin_modelo, tamanio_modelo);
			}
		}
		
		
		
		public static void buscar_secuencia_char(char [] marrchar, char [] arrchar, int inicio_modelo, int fin_modelo, int tamanio_modelo) {
			  int inicio, fin, tam, check;
			  	check = 0;
		        inicio = 0;
		        fin = -1;
		        tam = 0;
		        while ((inicio < MAXCOLUMNA - 1)) { // primera secuencia
		            inicio = obtener_inicio_secuencia(marrchar, fin + 1);
		            if (inicio < MAXCOLUMNA - 1) {
		                fin = obtener_fin_secuencia(marrchar, inicio);
		                tam = obtener_tamanio_secuencia(marrchar, inicio, fin);
		                if (tam == tamanio_modelo){
		                	for (int i = 0; i < tam; i++) {
								if(marrchar[inicio+i] == arrchar[inicio_modelo+i]){
									check = 1;
								}else{
									check =0;
									
								}
								
							}
		                }
		                
		                    
		            }
		        }
		        
	    }
		public static int obtener_inicio_secuencia(char[] arr, int inicio){
			while ((inicio < MAXCOLUMNA)&&(arr[inicio]==' ')){
				inicio++;
			}
			return inicio;
		}
		
		public static int obtener_fin_secuencia(char[] arr, int inicio){
			while ((inicio < MAXCOLUMNA)&&(arr[inicio]!=' ')){
				inicio++;	
			}
			return inicio-1;
		}
		
		public static int obtener_tamanio_secuencia(char[] arr, int inicio, int fin){
			int tamanio = 0;
			while (inicio <= fin){
				tamanio++;
				inicio++;
			}
			return tamanio;
			}
		/* -------------------------------------------------------------------------->*/		
		
	/*	
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
	*/			
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
			