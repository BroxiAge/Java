package arreglos;


/*
 Se tiene un arreglo ARR de enteros de tamaño MAX con secuencias de números distintos de 0
 separados por uno o más ceros. El arreglo tiene orden ascendente según la suma de los elementos de cada secuencia.
 Se pide hacer un programa completo para insertar en ARR manteniendo su orden una secuencia dada en un arreglo NUEVO de enteros.
 Supoenr que ARR y NUEVO comienzan y terminan con uno o más ceros y que wse encuentran cargados.
 */


import java.util.Random;
public class Dos {
public static final int MAX = 10;
public static final int MAXVALOR = 9;
public static final int MINVALOR = 1;
public static final double probabilidad_numero = 0.4;

	public static void main(String[] args) {
			
			int [] ARR, NUEVO;
			ARR = new int[MAX];
			NUEVO = new int[MAX];
			try {
				cargar_arreglo_aleatorio_secuencias_int(ARR);
				imprimir_arreglo_secuencias_int(ARR);
				}
			catch(Exception exc){
				System.out.println(exc);
			}
	}
	
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
		System.out.print("\n");
		}
	
	public static void cargar_arreglo_aleatorio_secuencias_int(int []arr){
		Random r = new Random();
		arr[0] = 0;
		arr[MAX-1] = 0;
		for (int pos = 1; pos < MAX-1; pos++){
			if (r.nextDouble()>probabilidad_numero){
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			}
			else{
				arr[pos]=0;
			}
		}
	}	
}



/*
Modelo[0] = 1;
Modelo[1] = 2;
Modelo[2] = 3;
Modelo[3] = 0;
Modelo[4] = 1;
Modelo[5] = 0;

Reemplazo[0] = 4;
Reemplazo[1] = 5;
Reemplazo[2] = 0;
Reemplazo[3] = 0;
Reemplazo[4] = 0;
Reemplazo[5] = 0;
*/