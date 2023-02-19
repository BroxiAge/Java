package practico_7;
/*
 * Hacer un programa que dado un arreglo ordenado creciente de enteros
de tama�o 10 que se encuentra precargado, solicite al usuario un numero
entero y lo inserte en el arreglo manteniendo su orden. Para ello tendr�
que realizar un corrimiento a derecha (se pierde el �ltimo valor del arreglo)
y colocar el numero en el arreglo en la posici�n indicada.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio_7 {	
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	
	public static void main(String[] args) {
		
		int val = 0;
		int pos = -1;
		int [] arrint= new int [MAX];
		
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un entero del 0 al - " + MAXVALOR + " que quiera insertar ordenadamente");
			val = Integer.valueOf(entrada.readLine());
			//cargar_arreglo_aleatorio_int(arrint);
			cargar_arreglo_int_arbitrario(arrint);
			imprimir_arreglo_int(arrint);
			
			pos = buscar_pos_arr_ordenado_creciente(arrint, val);
			corrimiento_der(arrint, pos);
			insertarOrdenado(arrint, val, pos);
			System.out.println("division");
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

	public static void corrimiento_der(int [] arrint, int pos){
		
		int MaxPos = MAX-1;
		while (MaxPos > pos){
			arrint[MaxPos] = arrint[MaxPos-1];
			MaxPos--;
		}
	}
	
	public static int buscar_pos_arr_ordenado_creciente(int [] arr, int val) {
		
		int i = 0;
		while ((i < MAX-1) && (arr[i] < val )) {
			i ++;
		}
		System.out.println("Posicion del valor encontrada: " + i);
		return i;
	}
	
	public static void insertarOrdenado (int[] arr,int val, int pos) {
		arr[pos] = val; 
	}
	
	public static void cargar_arreglo_int_arbitrario(int [] arr){
		
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 5;
		arr[3] = 7;
		arr[4] = 9;
		arr[5] = 11;
		arr[6] = 13;
		arr[7] = 15;
		arr[8] = 16;
		arr[9] = 17;
	}
}