import java.time.LocalDate;

public class Persona {
	private String nombre, apellido;
	private int edad;
	private LocalDate fechaNac;
	private int dni;
	private String sexo;
	private int peso, altura;
	
	//
	private double MINF = 18.5;
	private double MAXF = 25;
	private int MAYORIA = 18;
	private double EDADVOTO = 16;
	
	
	
	public Persona(int dni) {
		this("N", "N", dni);

	}

	public Persona(String nombre, String apellido, int dni) {
		this(nombre, apellido, LocalDate.now(), dni);
	}

	public Persona(String nombre, String apellido, LocalDate fechaNac, int dni) {
		this.sexo = "femenino";
		this.peso = 1;
		this.altura = 1;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getDni() {
		return dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public float calcularMasaCorporal() {
		return this.peso / ((this.altura) * (this.altura));

	}

	public boolean estaEnForma() {
		float masaCor = this.calcularMasaCorporal();
		if (masaCor > MINF && MAXF > masaCor) {
			return true;
		}
		return false;
	}

	public boolean isCumpleanios() {
		LocalDate fhoy = LocalDate.now();
		int dia = fhoy.getDayOfMonth();
		int mes = fhoy.getMonthValue();
		return (dia == fechaNac.getDayOfMonth() &&
				mes == fechaNac.getMonthValue());
		
		//if (dia == fechaNac.getDayOfMonth() &&
		//		mes == fechaNac.getMonthValue()) {
		//	return true;
		//}else return false;
			
	}
		
		
		
	

	public boolean mayorDeEdad() {
		if (this.calcularEdad() > MAYORIA)
			return true;
		else {
			return false;
		}
	}

	public int calcularEdad() {
		return LocalDate.now().getYear() - this.fechaNac.getYear();

	}

	public boolean mayorDeEdadParaVotar() {
		if (this.calcularEdad() > EDADVOTO)
			return true;
		else {
			return false;
		}

	}

	public String getInfo() {
		return this.nombre +"\n"+ this.apellido + this.dni + this.fechaNac + this.sexo + this.peso + this.altura;
	}
	
	
	public static void main(String[] args) {
		Persona p = new Persona(3);
		System.out.println(p.getInfo().length());
	}
}
