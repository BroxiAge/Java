package figuras;

public class Main3D {

	public static void main(String[] args) {
		
		
		Circulo c1 = new Circulo(10);
		System.out.println(c1);
		Rectangulo r1 = new Rectangulo(10,10);
		System.out.println(r1);
		
		
		Figura3D f3D = new Figura3D(c1,5);
		System.out.println(f3D);
		System.out.println(f3D.getNombre());
		System.out.println(f3D.getVolumen());
		System.out.println(f3D.getSuperficie());

		Figura3D f3D2 = new Figura3D(r1,5);
		System.out.println(f3D2);
		System.out.println(f3D2.getNombre());
		System.out.println(f3D2.getVolumen());
		System.out.println(f3D2.getSuperficie());
		
		f3D2.setFigura(c1);
		
		c1.setRadio(25);
		
		System.out.println(f3D2);
		System.out.println(f3D2.getNombre());
		System.out.println(f3D2.getVolumen());
		System.out.println(f3D2.getSuperficie());
		
		
	
	}

}
