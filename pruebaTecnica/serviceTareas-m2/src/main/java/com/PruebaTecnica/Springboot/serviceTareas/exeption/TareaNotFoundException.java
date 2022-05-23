package com.PruebaTecnica.Springboot.serviceTareas.exeption;

public class TareaNotFoundException extends RuntimeException {
    public TareaNotFoundException(Long id) {
        super("No se pudo encontrar la Tarea con el id:" + id);
    }
}
