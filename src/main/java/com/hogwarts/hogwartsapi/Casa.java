package com.hogwarts.hogwartsapi;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "casa")
@Data
public class Casa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_casa")
    private Long id;

    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;

    @Column(name = "fundador", nullable = false)
    private String fundador;

    @Column(name = "fantasma", nullable = false)
    private String fantasma;

    @ManyToOne
    @JoinColumn(name = "id_jefe", referencedColumnName = "id_profesor")
    private Profesor jefe;
}
