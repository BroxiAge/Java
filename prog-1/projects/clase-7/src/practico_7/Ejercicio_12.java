package practico_7;
/* Hacer un programa que dado el arreglo definido y precargado permita encontrar la
posición de inicio de la anteúltima secuencia (considerar comenzar a buscarla a
partir de la ultima posición del arreglo). */ 

public class Ejercicio_12 {
	
	public static final int MAX = 10;
	public static final int MIN = 1;

	public static void main(String[] args) {
		
		int [] arrint;
		arrint = new int[MAX];
		
		
		try {
			cargar_arreglo_int_arbitrario(arrint);
			imprimir_arreglo_secuencias_int(arrint);
			
			indice_inicial_sec(arrint, 9);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void cargar_arreglo_int_arbitrario(int[] arr) {

		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 7;
		arr[4] = 0;
		arr[5] = 6; // 5
		arr[6] = 5; // 6 
		arr[7] = 0;
		arr[8] = 8;
		arr[9] = 0;
	}
	
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
		
		System.out.print("\n");
		}
	
	public static int obtener_inicio_secuencia(int[] arr, int inicio){
		while ((MIN < inicio)&&(arr[inicio]==0)){
			inicio--;
		}
		return inicio;
		
	}
	
	public static int obtener_fin_secuencia(int[] arr, int inicio){
		while ((MIN < inicio)&&(arr[inicio]!=0)){
			inicio--;	
		}
		return inicio-1;
	}
	
	public static int indice_inicial_sec(int[] arr, int pos){
    	while ((pos>0)&&(arr[pos]!=0)){
    		pos--;
    	}
    	System.out.println(pos);
    	return pos+1;
    }
}
