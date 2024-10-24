
public class CalculadorDiferencia extends Calculador {

	private double valorInicial;
	
	
	public CalculadorDiferencia(double valorInicial) {
		super();
		this.valorInicial = valorInicial;
	}


	public double getValorInicial() {
		return valorInicial;
	}


	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}


	@Override
	public double calcular(FiguritaEL ff) {
		
		return valorInicial - ff.getUnidadesDisponibles();
	}

}
