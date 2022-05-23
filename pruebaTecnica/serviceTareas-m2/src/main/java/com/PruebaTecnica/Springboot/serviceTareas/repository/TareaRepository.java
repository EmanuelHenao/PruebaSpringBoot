package com.PruebaTecnica.Springboot.serviceTareas.repository;

import com.PruebaTecnica.Springboot.serviceTareas.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TareaRepository extends JpaRepository<Tarea,Long> {

    List<Tarea> findByIdUsuario(Long idUsuario);
}
