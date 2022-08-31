package general;

import ejemplo1.*;

public class AdministradorFiguras {

	
	public void imprimirPantalla(Rectangulo r1) {
		System.out.println(r1.getNombre() + " - " 
	                        + r1.getArea() + " - " 
				            + r1.getPerimetro());
	}
	
	public void imprimirPantalla(Circulo r1) {
		System.out.println(r1.getNombre() + " - " 
	                        + r1.getArea() + " - " 
				            + r1.getPerimetro());
	}
	
	
	
	
	public static void main(String[] figs) {
		AdministradorFiguras admin = new AdministradorFiguras();
		Rectangulo rr = new Rectangulo(10,20);
		
		//rr.lado1 =30;
		//rr.lado2 =30;
		admin.imprimirPantalla(rr);
		
		Circulo cc = new Circulo(10);
		
		admin.imprimirPantalla(cc);
		
		
		
	}
}
