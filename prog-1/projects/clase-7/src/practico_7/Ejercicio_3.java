package practico_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio_3 {	
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	
	public static void main(String[] args) {
		
		int minPos = 0;
		int [] arrint= new int [MAX];
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese una posicion ");
			minPos = Integer.valueOf(entrada.readLine());
			
			cargar_arreglo_aleatorio_int(arrint);
			imprimir_arreglo_int(arrint);
			System.out.println("asd");
			corrimiento_izq(arrint, minPos);
			imprimir_arreglo_int(arrint);
		}
		catch (Exception exc) {
			System.out.println(exc);
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
	public static void corrimiento_izq(int [] arrint, int minPos){
		
		while (minPos < MAX-1){
			arrint[minPos] = arrint[minPos+1];
			minPos++;
		}
	}
}