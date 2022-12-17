package clase_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * Escribir un programa que mientras el usuario cargue desde
teclado un caracter letra minúscula, llame a un método
que imprime por pantalla la tabla de multiplicar de 9.
 */
public class Ejercicio_1 {

	public static void main(String[] args) {
		
		char caracter;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println ("Ingrese su valor caracter: ");
			caracter = entrada.readLine().charAt(0);
			
			if(('a'<=caracter)&&(caracter<='z')){
				imprimir();
				System.out.println("finisht");
			}
			else{
				System.out.println("feil");
			}
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
	public static void imprimir (){
		final int val1 = 9;
		final int MIN = 1;
		final int MAX = 10;
		
		for (int numero = MIN; numero <= MAX; numero++){
			System.out.println(val1 + " * " + numero + " = " + (val1 * numero));
		}
	}

}
