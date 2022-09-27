package ejemplo1;

public class Circulo {
   private String nombre;
   private double radio;
   
   public Circulo(double radio) {
	   this.radio = radio;
	   nombre = "Circulo";
	   
   }
   
   
   
   
   public double getRadio() {
	return radio;
}




public void setRadio(double radio) {
	this.radio = radio;
}




public String getNombre() {
	return nombre;
}




public double getDiametro() {
	   return radio*2;
   }

 public double getArea() {
	 return Math.PI*radio*radio;
 }
 public double getPerimetro() {
	 return Math.PI*this.getDiametro();//2*radio
 }
}
