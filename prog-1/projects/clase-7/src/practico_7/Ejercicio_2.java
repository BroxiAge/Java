package practico_7;
/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, invierta el orden del contenido (por ejemplo: el que está en 0 se intercambia con
el que está en 9, el que está en 1 con el que está en 8...). Este intercambio no se debe realizar
de manera explícita, hay que hacer un método que incluya una iteración de intercambio.*/
import java.util.Random;

public class Ejercicio_2 {	
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	//PPAL
	public static void main(String[] args) {
		int [] arrint = new int [MAX];
		int cantPares = 0;
		cargar_arreglo_aleatorio_int(arrint);
		imprimir_arreglo_int(arrint);
		
		cantPares = obtener_cantidad_pares_arreglo(arrint);
		System.out.println("Cantidad de números pares:  " + cantPares);
	}
	
	//carga de arreglo de int con valores de MINVALOR a MAXVALOR
	public static void cargar_arreglo_aleatorio_int(int [] arr){
	Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
		arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
	
	public static int obtener_cantidad_pares_arreglo(int [] arrint){
		int suma = 0;
		for(int i = 0; i<=MAX-1; i++){
			if(arrint[i]%2==0){
				suma++;
			}
		}
		return suma;
	}
	//impresion de arreglo de int
	public static void imprimir_arreglo_int(int [] arr){
		for (int pos = 0; pos < MAX; pos++){
		System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		
		}
	}
	
	public static void invertir_arreglo(int [] arrint){
		int lastPos = MAX-1;
		int firstPos;
		for(int i=0 ; i<MAX/2 ; i++){
			firstPos = arrint[i]; //Tomas primer valor de la iteracion para poner al final.
			arrint[i] = arrint[lastPos-i]; //Reemplazas el primer valor, con el último de la iteracion actual.
			arrint[lastPos-i] = firstPos;  //Reemplaas el último valor, con el primero de la iteracion actual.
		}
	}
	
}