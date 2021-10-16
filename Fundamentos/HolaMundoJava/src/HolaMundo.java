
import java.util.Scanner;


public class HolaMundo {
    public static void main(String args[]){
        System.out.println("Escribe su titulo");
        Scanner consola = new Scanner (System.in);
        
        var titulo = consola.nextLine();
        System.out.println("Su titulo " + titulo);
        
        System.out.println("Escribe el autor");
        var autor = consola.nextLine();
        System.out.println(" " + titulo+" fue escrito por " + autor);
    } 
}
