package com.PruebaTecnica.Springboot.serviceTareas.casoUso;

import com.PruebaTecnica.Springboot.serviceTareas.entity.Tarea;
import com.PruebaTecnica.Springboot.serviceTareas.service.TareaService;
import org.springframework.stereotype.Component;

@Component
public class CrearTarea {
    private TareaService tareaService;

    public CrearTarea(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    public Tarea guardar(Tarea nuevaTarea) {
        return tareaService.guardar(nuevaTarea);
    }
}
