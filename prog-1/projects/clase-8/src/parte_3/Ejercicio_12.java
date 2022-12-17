	
package parte_3;
	/*
	 * 12. Hacer un programa que dada la matriz de secuencias de caracteres definida y
	precargada, permita encontrar por cada fila la posición de inicio y fin de la
	anteúltima secuencia (considerar comenzar a buscarla a partir de la ultima
	posición de la fila).
	 */
	import java.util.Random;
	
	public class Ejercicio_12 {
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
		mat_encontrar_anteultima_secuencia_fila(matint);
	}
	
	public static void mat_encontrar_anteultima_secuencia_fila(int [][] matint){
		for (int fila = 0; fila < MAXFILA; fila++) {
			encontrar_anteultima_secuencia_fila(matint[fila]);
			
		}
	}
	
	public static void encontrar_anteultima_secuencia_fila(int[] arrint) {
        int inicio, fin ;
        int inicio2, fin2;
        
        
        fin = encontrar_fin_inverso(arrint, MAXCOLUMNA-1);
        //System.out.println(fin);
        inicio = encontrar_inicio_inverso(arrint, fin);
        //System.out.println(inicio+1);
        
        fin2 = encontrar_fin_inverso(arrint, inicio);
        System.out.println(fin2);
        inicio2 = encontrar_inicio_inverso(arrint, fin2);
        System.out.println(inicio2+1);
        
        
	}
	public static int encontrar_fin_inverso(int[] arrint, int fin){
		
		
		
		while ((arrint[fin] == 0) && (fin > 0)){
			fin--;
		}
		return fin;
	}
	
	public static int encontrar_inicio_inverso(int[] arrint , int fin){
		
		while ((arrint[fin] != 0) && (fin > 0)){
			fin--;
		}
		
		return fin;
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
		