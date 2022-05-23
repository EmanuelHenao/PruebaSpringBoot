package com.PruebaTecnica.Springboot.serviceTareas.service;
import com.PruebaTecnica.Springboot.serviceTareas.entity.Tarea;
import com.PruebaTecnica.Springboot.serviceTareas.exeption.TareaNotFoundException;
import com.PruebaTecnica.Springboot.serviceTareas.repository.TareaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {
    private TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public Tarea guardar(Tarea nuevaTarea) {
        return tareaRepository.save(nuevaTarea);
    }

    public List<Tarea> obtenerTodas() {
        return tareaRepository.findAll();
    }

    public Tarea obtenerUna(Long id) {
        return tareaRepository.findById(id)
                .orElseThrow(
                        () -> new TareaNotFoundException(id)
                );
    }

    public Tarea actualizar(long id, Tarea nuevaTarea) {
        return tareaRepository.findById(id)
                .map(tarea -> {
                    tarea.setDescripcion(nuevaTarea.getDescripcion());
                    tarea.setCategoria(nuevaTarea.getCategoria());
                    tarea.setCompleta(nuevaTarea.isCompleta());
                    tarea.setFechaCreacion(nuevaTarea.getFechaCreacion());
                    tarea.setTiempoEstimadoMin(nuevaTarea.getTiempoEstimadoMin());
                    return tareaRepository.save(tarea);
                })
                .orElseGet(() -> {
                    nuevaTarea.setId(id);
                    return tareaRepository.save(nuevaTarea);
                });
    }

    public void eliminar(long id) {
        tareaRepository.delete(new Tarea(id));
    }


    //metodos de crud
}
