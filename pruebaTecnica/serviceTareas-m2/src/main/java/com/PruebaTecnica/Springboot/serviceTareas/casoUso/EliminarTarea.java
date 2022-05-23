package com.PruebaTecnica.Springboot.serviceTareas.casoUso;

import com.PruebaTecnica.Springboot.serviceTareas.service.TareaService;
import org.springframework.stereotype.Component;

@Component
public class EliminarTarea {
    private TareaService tareaService;

    public EliminarTarea(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    public void eliminar(long id) {
        tareaService.eliminar(id);
    }
}
