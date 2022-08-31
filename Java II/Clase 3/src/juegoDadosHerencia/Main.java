package juegoDadosHerencia;

public class Main {

	public static void main(String[] args) {
		Jugador j1 = new Jugador("Luis");
		
		DadoCargado[] cargados = new DadoCargado[2];
		cargados[0]=new DadoCargado(6,0.9);
		cargados[1]=new DadoCargado(6,0.9);
				
		JugadorTramposo j10 = new JugadorTramposo("Agustin",cargados);
			
		JuegoDados2 juego1 = new JuegoDados2(j1,j10);
		Jugador ganador = juego1.jugar();
		if (ganador!=null) {
			System.out.println(ganador.getNombre());
		}else {
			System.out.println("Empate");
		}
		System.out.println( "puntos " +
		            j1.getPuntos()+"-"+j10.getPuntos());
	    System.out.println("Empates " + (10-j1.getPuntos()-j10.getPuntos()));
	    
	    
	    
	    
	    Dado d1 = new Dado();
	    Dado d2 = new Dado();
	    
	    if (d1.equals(d2)) {
	    	System.out.println("SON IGUALES");
	    }
	    
	    if (d1 == d2) {
	    	System.out.println("SON IGUALES");
	    }
	  
	    
	    System.out.println("Hola" + d1);
	    System.out.println(d1.toString());
	    
	    System.out.println(d2);
	    System.out.println(d2.toString());
	    
	    
	    if (j1.equals(j10))
	    	System.out.println("SON IGUALES");
	    else
	    	System.out.println("Distintos");
	    
	    
	}
}
