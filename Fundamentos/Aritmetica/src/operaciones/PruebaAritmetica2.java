
package operaciones;


public class PruebaAritmetica2 {
    
    public static void main(String[] args) {
        
        //Variables locales
        
        Aritmetica ar = new Aritmetica();
        System.out.println("ar a = " + ar.a);
        System.out.println("ar b = " + ar.b);
    
        Aritmetica ar2 = new Aritmetica(5, 8);
        System.out.println("ar a = " + ar2.a);
        System.out.println("ar b = " + ar2.b);
    
    }
}
