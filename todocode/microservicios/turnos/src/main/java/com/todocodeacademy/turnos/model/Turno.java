 package com.todocodeacademy.turnos.model;
import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Turno {
  
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_TURNO")
    private Long id_turno;
    @Temporal (TemporalType.DATE)
    @Column(name = "FECHA")
    private String fecha;
    @Column(name = "TRATAMIENTO")
    private String tratamiento;
    @Column(name = "NOMBRE_COMPLETO_PACIENTE")
    private String nombreCompletoPaciente;
}
