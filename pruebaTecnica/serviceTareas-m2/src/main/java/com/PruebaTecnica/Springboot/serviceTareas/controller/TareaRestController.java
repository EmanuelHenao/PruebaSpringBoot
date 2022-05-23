package com.PruebaTecnica.Springboot.serviceTareas.controller;

import com.PruebaTecnica.Springboot.serviceTareas.casoUso.ActualizarTarea;
import com.PruebaTecnica.Springboot.serviceTareas.casoUso.CrearTarea;
import com.PruebaTecnica.Springboot.serviceTareas.casoUso.EliminarTarea;
import com.PruebaTecnica.Springboot.serviceTareas.casoUso.ObtenerTarea;
import com.PruebaTecnica.Springboot.serviceTareas.entity.Tarea;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaRestController {

    private ActualizarTarea actualizarTarea;
    private CrearTarea crearTarea;
    private EliminarTarea eliminarTarea;
    private ObtenerTarea obtenerTarea;

    public TareaRestController(ActualizarTarea actualizarTarea, CrearTarea crearTarea, EliminarTarea eliminarTarea, ObtenerTarea obtenerTarea) {
        this.actualizarTarea = actualizarTarea;
        this.crearTarea = crearTarea;
        this.eliminarTarea = eliminarTarea;
        this.obtenerTarea = obtenerTarea;
    }

    @PostMapping("/")
    ResponseEntity<Tarea> crearTarea(@RequestBody Tarea nuevoTarea){
        return new ResponseEntity<>(crearTarea.guardar(nuevoTarea), HttpStatus.CREATED);
    }

    @GetMapping("/")
    ResponseEntity<List<Tarea>> todasTareas(){
        return new ResponseEntity<>(obtenerTarea.obtenerTodas(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<Tarea> obtenerTareaByid(@PathVariable Long id){
        return new ResponseEntity<>(obtenerTarea.obtenerUna(id),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    ResponseEntity<Tarea> actualizarTarea(@PathVariable long id,@RequestBody Tarea nuevaTarea){
        return new ResponseEntity<>(actualizarTarea.actualizar(id,nuevaTarea),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    ResponseEntity eliminarTarea(@PathVariable long id){
        eliminarTarea.eliminar(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
