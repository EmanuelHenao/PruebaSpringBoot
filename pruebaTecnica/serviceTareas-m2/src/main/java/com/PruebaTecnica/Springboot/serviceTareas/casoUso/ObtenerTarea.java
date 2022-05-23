package com.PruebaTecnica.Springboot.serviceTareas.casoUso;

import com.PruebaTecnica.Springboot.serviceTareas.entity.Tarea;
import com.PruebaTecnica.Springboot.serviceTareas.service.TareaService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ObtenerTarea {
    private TareaService tareaService;

    public ObtenerTarea(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    public List<Tarea> obtenerTodas() {
        return tareaService.obtenerTodas();
    }

    public Tarea obtenerUna(Long id) {
        return tareaService.obtenerUna(id);
    }

    public List<Tarea> obtenerTareaByidUsuario(Long id) {
        return tareaService.obtenerTareaByidUsuario(id);
    }
}
