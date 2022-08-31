
public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Avion a1=new Avion(10);
		
		
		Avion a2=new Avion(10);
		
		
		System.out.println(a1);
		System.out.println(a2);
		if (a1 == a2) {
			System.out.println("IGUALES");
		} else {
			System.out.println("NO IGUALES");
		}
		
		
		if (a1.esIgual(a2)) {
			System.out.println("IGUALES");
		} else {
			System.out.println("NO IGUALES");
		}
		a2.setColor("rojo");
		if (a1.esIgual(a2)) {
			System.out.println("IGUALES");
		} else {
			System.out.println("NO IGUALES");
		}
		
		
		a1 = a2;
		System.out.println(a1);
		System.out.println(a2);
		if (a1 == a2) {
			System.out.println("IGUALES");
		} else {
			System.out.println("NO IGUALES");
		}
		a1.setColor("Rojo");
		System.out.println(a2.getColor());
		
		

	}

}
