package deportivos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {

	
	LocalTime hora;
	LocalDate dia;
	Usuario usuario;
	Cancha canchita;
	int horas;
	Establecimiento establecimiento;
	
	public double precioFinal() {
		double valor = canchita.getValor()*horas;
		if (establecimiento.esSocio(usuario)) {
			valor = valor - valor*establecimiento.getDescuentoSocio();
		}
		return valor;
		
	}
	
	public boolean esValido() {
		return establecimiento.estaLibre(canchita,dia,hora,horas);
			
	}
	/**
	 * controla que el turno no se solape con el dia la hora y duracion de los parametros
	 * @param dia dia que se choca
	 * @param hora hora de inicio que buscan
	 * @param horas duracion del que viene
	 * @return
	 */
	public boolean seChoca(LocalDate dia, LocalTime hora,int horas) {
		if(!this.dia.equals(dia)) {
			return false;
		} else {
			
			LocalTime inicio = this.hora;
			LocalTime fin = this.hora.plusHours(this.horas);
			LocalTime inicio2 = hora;
			LocalTime fin2 = hora.plusHours(horas);
			if(inicio.isBefore(inicio2) && fin.isAfter(inicio2)) {
				return true;
			} else	{
				if (inicio.isBefore(fin2) && fin.isAfter(fin2)) {
					return true;
				} if (inicio2.isBefore(inicio)&&fin2.isAfter(fin)) {
					return true;
				} else {
					return false;
				}
					
			}
			
			
			
		}
	}
	
	public Turno(LocalTime hora, LocalDate dia, Usuario usuario, Cancha canchita, int horas) {
		super();
		this.hora = hora;
		this.dia = dia;
		this.usuario = usuario;
		this.canchita = canchita;
		this.horas = horas;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public LocalDate getDia() {
		return dia;
	}
	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Cancha getCanchita() {
		return canchita;
	}
	public void setCanchita(Cancha canchita) {
		this.canchita = canchita;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}

	
	public boolean equals(Object obj) {
	 try {
		Turno other = (Turno) obj;
//Canchita		
		if (canchita == null) {
			if (other.getCanchita() != null)
				return false;
		} else if (!canchita.equals(other.getCanchita()))
			return false;
		
//Dia		
		if (dia == null) {
			if (other.getDia()!= null)
				return false;
		} else if (!dia.equals(other.getDia()))
			return false;
		
//Hora		
		if (hora == null) {
			if (other.getHora() != null)
				return false;
		} else if (!hora.equals(other.getHora()))
			return false;
		
//Horas		
		if (horas != other.getHoras())
			return false;
//NINGUNO ERA DISTINTO		
		//TODOS ERAN IGUALES
		return true;
		
	 } catch (Exception e) {
		 return false;
	 }
	}
	
	
	
	
}
