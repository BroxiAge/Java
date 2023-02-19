package practico_7;
/*
Hacer un programa que dado un arreglo ordenado creciente de enteros
de tama�o 10 que se encuentra precargado, solicite al usuario un numero
entero y elimine la primer ocurrencia de numero (un n�mero igual) en el
arreglo si existe.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio_9 {	
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	
	public static void main(String[] args) {
		
		int firstPos = MINVALOR -1;
		int lastPos = MAX - 1;
		int [] arrint= new int [MAX];
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			// System.out.println("Ingrese dos posiciones entre 0 y " + (MAXVALOR));
			 System.out.println("Ingrese la primera pos del array");
			 firstPos = Integer.valueOf(entrada.readLine());
			 System.out.println("Ingrese la 2da pos del array");
			 lastPos = Integer.valueOf(entrada.readLine());
			// cargar_arreglo_aleatorio_int(arrint);
			cargar_arreglo_int_arbitrario(arrint);
			imprimir_arreglo_int(arrint);
			ordenar_arreglo_burbujeo(arrint, firstPos, lastPos);
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
	
	public static void cargar_arreglo_int_arbitrario(int[] arr) {

		arr[0] = 99;
		arr[1] = 1;
		arr[2] = 4;
		arr[3] = 7;
		arr[4] = 3;
		arr[5] = 6;
		arr[6] = 5;
		arr[7] = 9;
		arr[8] = 8;
		arr[9] = 0;
	}
		
	public static void imprimir_arreglo_int(int [] arr){
		
		for (int pos = 0; pos < MAX; pos++){
		System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}
	
	public static void ordenar_arreglo_burbujeo(int[] arr, int firstPos, int lastPos){

		int temp;
		
		for(int i = 1 ; i < MAX ;i++){	
			for (int j = firstPos; j < lastPos ; j++){
				if (arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
