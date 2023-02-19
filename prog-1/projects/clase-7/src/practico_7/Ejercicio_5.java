package practico_7;
/*
 * Hacer un programa que dado un arreglo de enteros de tama�o 10 que se encuentra
precargado, solicite al usuario un numero entero y elimine la primer ocurrencia de numero (un
n�mero igual) en el arreglo si existe. Para ello tendr� que buscar la posici�n y si est�, realizar un
corrimiento a izquierda (queda una copia de la �ltima posici�n del arreglo en la ante�ltima
posici�n).
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio_5 {	
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	
	public static void main(String[] args) {
		
		int buscado = 0;
		int [] arrint= new int [MAX];
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese una posicion ");
			buscado = Integer.valueOf(entrada.readLine());
			cargar_arreglo_aleatorio_int(arrint);
			imprimir_arreglo_int(arrint);
			System.out.println("-");
			seekAndDestroy(arrint, buscado);
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
	
	public static void seekAndDestroy(int[] arrint, int buscado){
		int posBuscado = -1;
		int i = 0;
		while (i < (MAXVALOR-1)){
			if(arrint[i] == buscado){
				posBuscado = i;
				corrimiento_izq(arrint, posBuscado);
			}
		i++;
		}
	}
	
	public static void corrimiento_izq(int [] arrint, int indice){
		while (indice < MAX-1){
			arrint[indice] = arrint[indice+1];
			indice++;
		}
	}
}