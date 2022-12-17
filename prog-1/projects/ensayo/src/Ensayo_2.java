import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ensayo_2 {
	/*
    Hacer un programa completo que mientras el usuario ingrese un caracter letra mayuscula o minuscula realice lo siguiente:
    _cuente cuantas veces el caracter ingresado fue letra vocal minuscula.
    Finalmente cuando sale de la iteracion imprima por pantalla la cantidad acumulada.
    */
	public static void main(String[] args) {
		
		char caracter;
		int contVoc = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			
			System.out.println("Ingrese un caracter");
			caracter = entrada.readLine().charAt(0);
			
			while (caracter != '*' ){
				if (('a'<=caracter)&&(caracter<='z')){
					 if ((caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u')){
						 contVoc ++;
					}
				}
			System.out.println("Ingrese un caracter, (para salir, ingrese *)");
			caracter = entrada.readLine().charAt(0);
			}
			
			System.out.println(contVoc);
		}	
		catch(Exception exc){
			System.out.println(exc);
			
		}
	}

}
