package com.todocodeacademy.cursoSpringBoot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PropiedadDTO {

    private Long idPropiedad;
    private String tipo;
    private String direccion;
    private Double valorAlquiler;
    private String nombreInquilino;
    private String apellidoInquilino;
}
