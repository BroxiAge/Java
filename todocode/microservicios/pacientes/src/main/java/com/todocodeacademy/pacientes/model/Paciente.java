package com.todocodeacademy.pacientes.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_PACIENTE")
    private Long idPaciente;
    @Column(name = "DNI")
    private String dni;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "FECHA_NAC")
    @Temporal (TemporalType.DATE)    
    private LocalDate fechaNac;
    @Column(name = "TELEFONO")
    private String telefono;

    public Paciente() {
    }

    public Paciente(Long idPaciente, String dni, String nombre, String apellido, LocalDate fechaNac, String telefono) {
        this.idPaciente = idPaciente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
    }
}
