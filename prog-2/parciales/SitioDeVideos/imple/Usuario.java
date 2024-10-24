package parciales.SitioDeVideos.imple;

import java.time.*;

public class Usuario {

    private String nombreusuario, email;
    private LocalDate anoRegistracion;


    public Usuario(LocalDate anoRegistracion, String email, String nombreusuario) {
        this.anoRegistracion = anoRegistracion;
        this.email = email;
        this.nombreusuario = nombreusuario;
    }

    public LocalDate getAnoRegistracion() {
        return anoRegistracion;
    }

    public void setAnoRegistracion(LocalDate anoRegistracion) {
        this.anoRegistracion = anoRegistracion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }
}
