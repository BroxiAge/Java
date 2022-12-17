package Metodos;

import java.util.Random;

public class Corrimiento_Izq {	
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	
	public static void main(String[] args) {
		int [] arrint= new int [MAX];
		
		cargar_arreglo_aleatorio_int(arrint);
		imprimir_arreglo_int(arrint);
		corrimiento_izq(arrint);
		imprimir_arreglo_int(arrint);
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
	
	public static void corrimiento_izq(int [] arrint){
		
		int minPos = 5;
		while (minPos < MAX-1){
			arrint[minPos] = arrint[minPos+1];
			minPos++;
		}
	}
}