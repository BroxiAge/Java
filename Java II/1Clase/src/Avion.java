
public class Avion {

	private  int capacidad;
	 String color="blanco";
	 String estado;
	 double velocidad_por_hora;
	

	public Avion() {
		this(0,"blanco");
	}
	public Avion(int capacidad) {
		this(capacidad,"blanco","aterrizado",0);
	}
	
	public Avion(int capacidad, String color) {
		this(capacidad,color,"aterrizado",0);
	}
	
	public Avion(int capacidad, String color, String estado) {
		this(capacidad,color,estado,0);
	}
	
	public Avion(int capacidad, String color, String estado, double velocidad_por_hora) {
		this.setCapacidad(capacidad);
		this.setColor(color);
		this.estado = estado;
		this.velocidad_por_hora = velocidad_por_hora;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		if (capacidad >=0) {
			this.capacidad = capacidad;
		}
		else {
			this.capacidad = 0;
		}
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		
	  if (!color.equalsIgnoreCase("celeste")) {
		this.color = color;
	  } else {
		  this.color = "blanco" ;
	  }
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double getVelocidad_por_hora() {
		return velocidad_por_hora;
	}
	public void setVelocidad_por_hora(double velocidad_por_hora) {
		this.velocidad_por_hora = velocidad_por_hora;
	}
	
	
	public boolean esIgual(Avion otro) {
		if ((capacidad == otro.getCapacidad()) ){
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
