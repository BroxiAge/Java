package agenda;

public class ArregloDinamico {

	
	Object[] elementos;
	int contador = 0;
	
	public ArregloDinamico() {
		elementos = new Object[10];
		contador =0;
	}
	public ArregloDinamico(int capacidadInicial) {
		elementos = new Object[capacidadInicial];
		contador =0;
	}
	
	public void addElemento(Object o1) {
		elementos[contador]=o1;
		contador++;
		if (contador == elementos.length) {
			//ESTOY AL TOPE
			Object[] aux = new Object[contador*2];
			for(int i =0;i<contador;i++) {
				aux[i] = elementos[i];
			}
			elementos = aux;
		}
	}
	
	public Object getElemento(int i) {
		
		if (i>=0 && i<contador) {
			return elementos[i];
		} else {
			return null;
		}
		
	}
	
	
	public int getCantidadElementos() {
		return contador;
	}
	
	public String toString() {
		String inicio = "[";
		
		for (int i=0; i<contador; i++) {
		    if (i != 0)
			    inicio = inicio +  ","; 
		    inicio = inicio + elementos[i];
			
		}
		inicio = inicio + "]";
		return inicio;
	}
	
	public void removeElemento(int pos) {
		for(int i = pos; i<contador-1; i++) {
			elementos[i] = elementos[i+1];
		}
		elementos[contador]=null;
		contador --;
	}
	
	public int getPosicion(Object o1) {
		
		for (int i =0; i< contador; i++){
			if (elementos[i].equals(o1)) {
				return i;
			}
		}
		return -1;
	}
	
	public void removeElemento(Object o2) {
		
		int pos = this.getPosicion(o2);
		if (pos!=-1) {
			this.removeElemento(pos);
		}
		
	}
	
	public static void main(String[] args) {
		ArregloDinamico arr = new ArregloDinamico();
		
		for(int i =0; i<100; i++) {
			arr.addElemento("ELEMENTO " + i);
		}
		
		System.out.println(arr);
		
		for (int j = 0; j<arr.getCantidadElementos();j++) {
			System.out.println(arr.getElemento(j));
		}
	}
}
