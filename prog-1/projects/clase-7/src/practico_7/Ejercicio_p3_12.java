package practico_7;
/*
 * Hacer un programa que dado el arreglo definido y precargado permita
encontrar la posici�n de inicio y fin de la ante�ltima secuencia (considerar
comenzar a buscarla a partir de la ultima posici�n del arreglo).
 */


import java.util.Random;
public class Ejercicio_p3_12 {
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
				encontrar_anteultima_secuencia_fila(arrint);
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
	
	public static int encontrar_fin_inverso(int[] arrint, int fin){
		
		while (arrint[fin] == 0){
			fin--;
		}
		return fin;
	}
	public static int encontrar_inicio_inverso(int[] arrint , int fin){
		
		while (arrint[fin] != 0){
			fin--;
		}
		
		return fin;
	}
	
	public static void encontrar_anteultima_secuencia_fila(int[] arrint) {
        int inicio, fin ;
        int inicio2, fin2;
        
        
        fin = encontrar_fin_inverso(arrint, MAX-1);
        //System.out.println(fin);
        inicio = encontrar_inicio_inverso(arrint, fin);
        //System.out.println(inicio+1);
        
        fin2 = encontrar_fin_inverso(arrint, inicio);
        System.out.println(fin2);
        inicio2 = encontrar_inicio_inverso(arrint, fin2);
        System.out.println(inicio2+1);
        
	}
}  