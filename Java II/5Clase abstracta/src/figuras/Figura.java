package figuras;



public abstract class Figura {

    private String nombre;
	
    public Figura(String n) {
    	nombre = n;
    }
    
    //Metodos Concretos
	public String getNombre() {
		
		return nombre;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Metodos Abstractos No tienen cuerpo 
	public abstract  double getArea(); 
	public abstract  double getPerimetro();
	
	//Metodo Template, es un metodo conctreto que usa metodos 
	//que son abstractos en la clase
	public String toString() {
		//"NOMBRE - Area:valor -Per:valor"
		
	  return nombre + "-Area:"+ this.getArea() +" -Per:"+ this.getPerimetro();	
	}
}
