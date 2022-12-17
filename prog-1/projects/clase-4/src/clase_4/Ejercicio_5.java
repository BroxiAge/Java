package clase_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
  	Hacer un programa que solicite la carga desde consola de 
  	un car�cter y realice: imprima si es d�gito, o letra min�scula, o 
	es cualquier otro car�cter. Si es letra min�scula indicar si es 
	vocal o consonante
 */
public class Ejercicio_5 {

public static void main(String[] args) {
		
		char caracter;
		
		try {

			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println ("Ingrese su caracter: ");
			caracter = entrada.readLine().charAt(0);
			
			if (('a'<= caracter) && (caracter <='z' )){
				System.out.println("Es caracter min�scula");
				 if ((caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u')){
					 System.out.println("Es caracter vocal");
				}else{
					System.out.println("Es consonante");
				}
			}else if (('A'<= caracter) && (caracter <='Z'  )){
				System.out.println("El caracter ingresado es inv�lido, no se permiten mayus.");
				
			}else{
				System.out.println("Este es su digito: " + caracter);
			}
		}
			catch (Exception exc) {

			//imprimo por consola un mensaje con el valor de la variable exc (tipo de error)
			System.out.println(exc);

			}
	}
	
}
