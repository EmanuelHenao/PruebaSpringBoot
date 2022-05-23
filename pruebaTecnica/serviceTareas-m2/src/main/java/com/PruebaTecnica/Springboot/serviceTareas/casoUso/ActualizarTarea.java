package com.PruebaTecnica.Springboot.serviceTareas.casoUso;

import com.PruebaTecnica.Springboot.serviceTareas.entity.Tarea;
import com.PruebaTecnica.Springboot.serviceTareas.service.TareaService;
import org.springframework.stereotype.Component;

@Component
public class ActualizarTarea {
    private TareaService tareaService;

    public ActualizarTarea(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    public Tarea actualizar(long id, Tarea nuevaTar) {
        return tareaService.actualizar(id,nuevaTar);
    }
}
