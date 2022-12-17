package practico_7;
/*
 * Hacer un programa que dado un arreglo ordenado creciente de enteros
de tamaño 10 que se encuentra precargado, solicite al usuario un numero
entero y lo inserte en el arreglo manteniendo su orden. Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del arreglo)
y colocar el numero en el arreglo en la posición indicada.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio_7 {	
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	
	public static void main(String[] args) {
		
		int pos = 0;
		int [] arrint= new int [MAX];
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un entero del 0 al - " + (MAXVALOR-1));
			pos = Integer.valueOf(entrada.readLine());
			cargar_arreglo_aleatorio_int(arrint);
			ordenar_arreglo_burbujeo(arrint);
			imprimir_arreglo_int(arrint);
			System.out.println("-");
			
			corrimiento_der(arrint, pos);
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
	
	public static void ordenar_arreglo_burbujeo(int[] arr){
		int temp;
		for(int i = 1;i < MAX;i++){
			for (int j = 0 ; j < MAX - 1; j++){
				if (arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void corrimiento_der(int [] arrint, int pos){
		
		int MaxPos = MAX-1;
		while (MaxPos > pos){
			arrint[MaxPos] = arrint[MaxPos-1];
			MaxPos--;
		}
		
	}
}