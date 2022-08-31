
public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Avion a1=new Avion(10);
		
		
		System.out.println(a1);
		System.out.println(a1.getCapacidad());
		System.out.println(a1.getColor());
		System.out.println(a1.getEstado());
		System.out.println(a1.getVelocidad_por_hora());
		
		Avion a2=new Avion(50);
		
		
		System.out.println(a2);
		System.out.println(a2.getCapacidad());
		System.out.println(a2.getColor());
		System.out.println(a2.getEstado());
		System.out.println(a2.getVelocidad_por_hora());
		
		if (a1 == a2) {
			System.out.println("IGUALES");
		} else {
			System.out.println("NO IGUALES");
		}
		
		int x = 0;
		int y = 0;
		
		if (x == y) {
			System.out.println("IGUALES");
		} else {
			System.out.println("NO IGUALES");
		}
		
		String s1= "Hola";
		String s2= new String("Hola");
		if (s1.equals(s2)) {
			System.out.println("IGUALES");
		} else {
			System.out.println("NO IGUALES");
		}
		
		Avion bc = new Avion(-20);
		
		bc.setColor("CeleSte");
		System.out.println(bc.getColor());
	}

}
