package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        Aritmetica ar = new Aritmetica();
        ar.a = 3;
        ar.b = 2;
        ar.sumar();
        
        var resultado = ar.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
       resultado = ar.sumarConArgumentos(5, 8);
        System.out.println("resultado = " + resultado);
    }
    
}
