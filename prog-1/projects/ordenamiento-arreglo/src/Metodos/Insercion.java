package Metodos;

import java.util.Random;

public class Insercion {	
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	
	public static void main(String[] args) {
		int [] arrint= new int [MAX];
		cargar_arreglo_aleatorio_int(arrint);
		imprimir_arreglo_int(arrint);
		System.out.println("divison");
		ordenar_arreglo_insercion(arrint);
		imprimir_arreglo_int(arrint);
	}
	
	public static void ordenar_arreglo_insercion(int[]arr) {
		int aux, j;
			for (int i = 1; i < MAX; i++) {
				aux = arr[i];
				j = i - 1;
				while ((j >= 0) && (arr[j] > aux)){
					arr[j+1] = arr[j];
					j--;
				}
				arr[j+1] = aux;
			}
		}
	
	//carga de arreglo de int con valores de MINVALOR a MAXVALOR
	public static void cargar_arreglo_aleatorio_int(int [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
		
	//impresion de arreglo de int
	public static void imprimir_arreglo_int(int [] arr){
		for (int pos = 0; pos < MAX; pos++){
		System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}
}
