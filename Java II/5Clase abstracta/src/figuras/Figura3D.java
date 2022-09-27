package figuras;

public  class Figura3D {

	double altura;
	Figura f1;//usa el concepto abstracto de figura
	//como un elemento al que le puedo pedir el area el perimetro y el nombre
	
	
	public Figura3D(Figura base, double altura) {
		f1=base;
		this.altura = altura;
		
	}
	
	
	public double getVolumen() {
		return f1.getArea()*this.getAltura();
	}

	public double getSuperficie() {
		return f1.getArea()+f1.getArea()+altura*f1.getPerimetro();
	}
	
	public String getNombre() {
		return f1.getNombre()+"3D";
	}


	
	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}



	public Figura getFigura() {
		return f1;
	}



	public void setFigura(Figura f1) {
		this.f1 = f1;
	}

	
	public String toString() {
		
		return "Figura 3D de: {"+ f1 + ", altura:" + altura +"}";  
	}
	

}
