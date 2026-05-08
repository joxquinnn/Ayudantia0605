package com.EjercicioAyudantia.ISoft.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private Long id;
    private String titulo;
    private String prioridad;
    private String fechaLimite;
    private Boolean completada;
}
