package com.Gestionempresa.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="tarea")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descripcion")
    private String descipcion;

    @Column(name = "fecha_vencimiento")
    private LocalDateTime fecha_vencimiento;
}