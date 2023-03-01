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
	public static final int MAX = 7;
	public static final int MAXVALOR = 10;
	public static final int MAXVALORP = 6;
	public static final int MINVALOR = 1;
	
	public static void main(String[] args) {
		
		int val = 0;
		int pos = -1;
		int [] arrint= new int [MAX];
		int [] P = new int [6];
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			//System.out.println("Ingrese un entero del 0 al - " + MAXVALOR + " que quiera insertar ordenadamente");
			//val = Integer.valueOf(entrada.readLine());
			//cargar_arreglo_aleatorio_int(arrint);
			cargar_arreglo_int_arbitrario(arrint, P);
			imprimir_arreglo_int(arrint);
			System.out.println("aca va pe");
			imprimir_arreglo_int_P(P);
			
			//pos = buscar_pos_arr_ordenado_creciente(arrint, val);
			pos = 1;
			
			corrimiento_izq(arrint, pos);
			corrimiento_izq(arrint, pos);
			
			//corrimiento_der(arrint, pos);
			//corrimiento_der(arrint, pos);
			//corrimiento_der(arrint, pos);
			
			
			//corrimiento_izq(arrint, pos);
			
			//insertarOrdenado(arrint, val, pos);
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
	
public static void imprimir_arreglo_int_P(int [] arr){
		
		for (int pos = 0; pos < MAXVALORP; pos++){
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
	
	public static void corrimiento_izq(int[] arrint, int minPos) {

		while (minPos < MAX - 1) {
			arrint[minPos] = arrint[minPos + 1];
			minPos++;
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
	
	public static void cargar_arreglo_int_arbitrario(int [] arr, int[] p){
		
		arr[0] = 0;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 0;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
//		arr[7] = 0;
//		arr[8] = 6;
//		arr[9] = 5;
//		arr[10] = 4;
//		arr[11] = 1;
//		arr[12] = 0;
//		arr[13] = 41;
//		arr[14] = 5;
//		arr[15] = 0;
//		arr[16] = 3;
//		arr[17] = 2;
//		arr[18] = 0;
		
		p[0] = 0;
		p[1] = 0;
		p[2] = 3;
		p[3] = 8;
		p[4] = 5;
		p[5] = 0;
	}
}