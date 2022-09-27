package contables;

public class Cliente {

	private static Cliente elPrimeroDeTodos;
	
	private int nroLegajo;
	
	private static int contadorClientes=0;
	
	public Cliente() {
		if (elPrimeroDeTodos == null)
			elPrimeroDeTodos=this;
		
		contadorClientes++;
		nroLegajo =contadorClientes;
	}

	public int getNroLegajo() {
		return nroLegajo;
	}

	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}

	public static int getContadorClientes() {
		return contadorClientes;
	}
	
	public static void  setContadorClientes(int valorNuevo) {
	    int xx =34;
	    System.out.println(xx);
		contadorClientes = valorNuevo;;
	}

	
	
	
	public static void main(String[] args) {
		
		Cliente c1;
		int xx =(int) (Math.random()*50);
		System.out.println(xx);
		for(int i =0; i<xx; i++){
			c1 = new Cliente();
			//System.out.println(c1 +"- " +c1.getNroLegajo());
		    //
			c1=null;
		}
		System.gc();
		//Cliente aux = new Cliente();
		System.out.println(Cliente.getContadorClientes());
		
		
		Cliente.setContadorClientes(0);
		
		Cliente c2 = new Cliente();
		System.out.println(c2.getNroLegajo());
		
		System.out.println(Math.random());
		Math.pow(10, 2);
	}
}
