package practico_7;
/*
 * Hacer un programa que dado el arreglo definido y precargado permita
encontrar la posición de inicio y fin de la secuencia cuya suma de valores sea
mayor.
 */

import java.util.Random;
public class Ejercicio_11 {
public static final int MAX = 40;
public static final int MAXVALOR = 9;
public static final int MINVALOR = 1;
public static final double probabilidad_letra = 0.4;
public static final double probabilidad_numero = 0.4;

	public static void main(String[] args) {
			
			int [] arrint;
			arrint = new int[MAX];
			
			try{
				
				cargar_arreglo_aleatorio_secuencias_int(arrint);
				imprimir_arreglo_secuencias_int(arrint);
				
				
				imprimir_arreglo_secuencias_int(arrint); //REUTILIZAMOS
				imprimir_suma_cada_secuencia(arrint);
			}
			catch(Exception exc){
				System.out.println(exc);
			}
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
	
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
		System.out.print("\n");
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

	public static void imprimir_suma_cada_secuencia(int[] arr){
		int inicio,fin,suma, sumaMayor;
		inicio = 0;
		fin = -1;
		sumaMayor = -1;
		
		while ((inicio < MAX)){
			inicio = obtener_inicio_secuencia(arr,fin+1); //REUTILIZAMOS
			if (inicio < MAX){
				fin = obtener_fin_secuencia(arr,inicio); //REUTILIZAMOS
				suma = obtener_suma_secuencia(arr,inicio,fin);
				System.out.println("La suma de la secuencia de "+inicio+" a "+fin+" es "+suma);
				if(suma > sumaMayor){
					sumaMayor = suma;
				}
			}
		}
		if (sumaMayor != -1){
			System.out.println("La suma de la secuencia Mayor es: "+ sumaMayor);
		}
	}
	
	public static int obtener_suma_secuencia(int[] arr, int inicio, int fin){
		int suma = 0;
		while (inicio <= fin){
			suma+=arr[inicio];
			inicio++;
		}
		return suma;
	}
}