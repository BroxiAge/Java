package general;

import ejemplo2.*;

public class AdministradorF2 {

	public void imprimirPantalla(Figura ff) {
		
		System.out.println(ff.getNombre() + " - " 
                + ff.getArea() + " - " 
	            + ff.getPerimetro());

	}
	
	public static void main(String[] args) {
	   Circulo cc = new Circulo(10);
	   Rectangulo rr = new Rectangulo(10,20);
	   Figura ff = new Figura("Ejemplo");
	   
	 //ANDA  ff = cc; Circulo es una Figura 
	 //ANDA  ff = rr; Rectangulo es una Figura
	   
	   //cc = ff; Figura NO es un Circulo
	   //rr = ff; Figura NO es un Rectangulo
	   //cc = rr; Rectangulo NO es un Circulo
	   
	   AdministradorF2 admin2 = new AdministradorF2();
	   
	   admin2.imprimirPantalla(ff);
	   
	   admin2.imprimirPantalla(cc);
	   
	   admin2.imprimirPantalla(rr);
	   
	   System.out.println(ff.getArea());
	   System.out.println(cc.getArea());
	   ff= cc;
	   System.out.println(cc.getArea());
	   ff= rr;
	   
	  // ((Circulo)ff).getRadio(); SOLO FUNCIONA SI FF APUNTA A UN CIRCULO
	   
	   MedioCirculo md = new MedioCirculo(10);
	   System.out.println(md.getArea());
		
	   Figura ff2 = new Figura("Ejemplo");
	   ff2.imprimir();
	   //ff2.getRadio();
	   md.getRadio();
	   md.imprimir();
	   Rectangulo rr2 = new Rectangulo(10,20);
	   rr2.imprimir();
	}

}
