package operaciones;

public class Aritmetica {
    int a;
    int b;

    //Constructor vacio
    public Aritmetica(){
    System.out.println("ejecutando constructor");
}
    public Aritmetica(int a, int b){
    this.a = a;
    this.b = b;
    System.out.println("ejecutando Sobrecarga de constructor");
}
    //Metodo
    public void sumar(){
        int result = this.a+this.b;
        System.out.println("result = " + result);
        
    }
    
    public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;
        return a + b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
       // return a + b;
       return sumarConRetorno();
    } 
}
