package seleccion_insercion_burbujeo;

import java.util.Random;
public class Invertir_secuencia {
public static final int MAX = 10;
public static final int MAX2 = 10;
public static final int MAXVALOR = 9;
public static final int MINVALOR = 1;
public static final double probabilidad_letra = 0.4;
public static final double probabilidad_numero = 0.4;

	public static void main(String[] args) {
			int tamanio_secuencia = 3;
			int [] Arrsec;
			Arrsec = new int[MAX];
			
			try{
				cargar_arreglo_aleatorio_secuencias_int(Arrsec);
				imprimir_arreglo_secuencias_int(Arrsec);
				
				invertir_secuencia_por_tamanio(Arrsec, tamanio_secuencia);
				imprimir_arreglo_secuencias_int(Arrsec);
			}
			catch(Exception exc){
				System.out.println(exc);
			}
	}
	
	public static void invertir_secuencia_por_tamanio(int[] arr, int tamanio){
		int inicio,fin,tamanio_secuencia;
		inicio = 0;
		fin = -1;
		if ((inicio < MAX)){
			inicio = obtener_inicio_secuencia(arr,fin+1); //REUTILIZAMOS
				if (inicio < MAX){
					fin = obtener_fin_secuencia(arr,inicio); //REUTILIZAMOS
					tamanio_secuencia = obtener_tamanio_secuencia(arr,inicio,fin);
					System.out.println("El tamanio de la secuencia de "+inicio+" a "+fin+" es "+tamanio_secuencia);
					if (tamanio_secuencia == tamanio){
						invertir_secuencia_dada(arr, inicio, fin, tamanio_secuencia);
					}
				}
		}
	}
	
	public static void invertir_secuencia_dada(int[] arrint,int inicio,int fin, int tamanio_secuencia){
			
			int firstPos;
			for(int i=0 ; i< tamanio_secuencia-1 ; i++){
				System.out.println("El inicio de la secuencia "+ inicio);
				System.out.println("El fin de la secuencia "+ fin);
				firstPos = arrint[inicio+i]; 
				arrint[inicio+i] = arrint[fin-i]; 
				arrint[fin-i] = firstPos;
			}
	}
	
	public static int obtener_tamanio_secuencia(int[] arr, int inicio, int fin){
		int tamanio = 0;
		while (inicio <= fin){
			tamanio++;
			inicio++;
		}
		return tamanio;
		}
	
	public static int obtener_inicio_secuencia(int[] arr, int inicio){
		while ((inicio < MAX)&&(arr[inicio]==0)){
			inicio++;
		}
		return inicio;
	}
	
	public static int obtener_fin_secuencia(int[] arr, int inicio){
		while ((inicio < MAX)&&(arr[inicio]!=0)){
			inicio++;	
		}
		return inicio-1;
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