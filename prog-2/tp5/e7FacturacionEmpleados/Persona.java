package tp5.e7FacturacionEmpleados;

//Podria llamarse empleado, o incluso podriia haer 1 clase que extienda de Persona para agregar el sueldo mensual.
public class Persona {

    private String nombre;
    private String apellido;
    private int dni;
    private double sueldoMensual;

    public Persona(String nombre, String apellido, int dni, double sueldoMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldoMensual;
    }
}
