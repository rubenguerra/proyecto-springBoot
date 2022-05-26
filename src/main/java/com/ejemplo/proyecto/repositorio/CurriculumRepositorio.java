package com.ejemplo.proyecto.repositorio;

import com.ejemplo.proyecto.modelo.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurriculumRepositorio extends JpaRepository<Curriculum, Long> {
}
