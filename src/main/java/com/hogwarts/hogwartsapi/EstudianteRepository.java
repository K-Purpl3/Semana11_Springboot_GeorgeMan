package com.hogwarts.hogwartsapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Student, Long> {
    List<Student> findByCasaNombre(String nombreCasa);
    List<Student> findByAnyoCurso(Integer anyoCurso);
}
