package practico_7;
/*
Hacer un programa que dado un arreglo ordenado creciente de enteros
de tamaño 10 que se encuentra precargado, solicite al usuario un numero
entero y elimine la primer ocurrencia de numero (un número igual) en el
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
		
		int val1 = -1;
		int val2 = -1;
		int [] arrint= new int [MAX];
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese dos posiciones entre 0 y " + (MAXVALOR));
			System.out.println("Ingrese la primera pos del array");
			val1 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese la 2da pos del array");
			val2 = Integer.valueOf(entrada.readLine());
			cargar_arreglo_aleatorio_int(arrint);
			imprimir_arreglo_int(arrint);
			System.out.println("--");
			ordenar_arreglo_insercion(arrint, val1, val2+1);//el +1 es porque el arr termina en 9, y no en 10.
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
		
	public static void imprimir_arreglo_int(int [] arr){
		
		for (int pos = 0; pos < MAX; pos++){
		System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}
	
	public static void ordenar_arreglo_insercion(int[]arr, int val1, int val2) {
		int aux, j;
			for (int i = val1; i < val2; i++) {
				aux = arr[i];
				j = i - 1;
				while ((j >= 0) && (arr[j] > aux)){
					arr[j+1] = arr[j];
					j--;
				}
				arr[j+1] = aux;
			}
		}
	
}
