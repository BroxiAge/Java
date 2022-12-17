package Metodos;

import java.util.Random;

public class Seleccion {	
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	
	public static void main(String[] args) {
		int [] arrint= new int [MAX];
		cargar_arreglo_aleatorio_int(arrint);
		imprimir_arreglo_int(arrint);
		System.out.println("divison");
		ordenar_arreglo_seleccion(arrint);
		imprimir_arreglo_int(arrint);
	}
	
	public static void ordenar_arreglo_seleccion(int[]arr) {
		int pos_menor, tmp;
		for (int i = 0; i < MAX; i++) {
			pos_menor = i;
			for (int j = i + 1; j < MAX; j++){
				if (arr[j] < arr[pos_menor]) {
					pos_menor = j;
				}
			}
			if (pos_menor != i){
				tmp = arr[i];
				arr[i] = arr[pos_menor];
				arr[pos_menor] = tmp;
			}
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
