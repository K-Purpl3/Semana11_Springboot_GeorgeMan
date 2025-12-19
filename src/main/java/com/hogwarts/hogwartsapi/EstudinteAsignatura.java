package com.hogwarts.hogwartsapi;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "estudiante_asignatura")
@Data
@IdClass(EstudianteAsignaturaID.class)

public class EstudinteAsignatura {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private Student estudiante;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_asignatura")
    private Asignatura asignatura;

    @Column(name = "calificacion")
    private Double calificacion;
}