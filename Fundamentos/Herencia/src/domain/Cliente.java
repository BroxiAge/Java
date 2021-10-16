package domain;

//import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
//import java.time.format.*;  // Este paquete contiene DateTimeFormatter.

public class Cliente extends Persona {
    private static int idCliente;
    //private Date fechaRegistro;
    private boolean vip;

    public Cliente(){
    
    }
    
    public Cliente(String nombre, char genero, int edad, String direccion, boolean vip) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.idCliente;
        this.vip = vip;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", nombre=").append(this.nombre);
        sb.append(", genero=").append(this.genero);
        sb.append(", edad=").append(this.edad);
        sb.append(", direccion=").append(this.direccion);
        
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
