package com.PruebaTecnica.Springboot.serviceUsuarios.controller;

import com.PruebaTecnica.Springboot.serviceUsuarios.casoUso.ActualizarUsuario;
import com.PruebaTecnica.Springboot.serviceUsuarios.casoUso.CrearUsuario;
import com.PruebaTecnica.Springboot.serviceUsuarios.casoUso.EliminarUsuario;
import com.PruebaTecnica.Springboot.serviceUsuarios.casoUso.ObtenerUsuario;
import com.PruebaTecnica.Springboot.serviceUsuarios.entity.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioRestController {

    private CrearUsuario crearUsuario;
    private ObtenerUsuario obtenerUsuario;
    private ActualizarUsuario actualizarUsuario;
    private EliminarUsuario eliminarUsuario;

    public UsuarioRestController(CrearUsuario crearUsuario, ObtenerUsuario obtenerUsuario, ActualizarUsuario actualizarUsuario, EliminarUsuario eliminarUsuario) {
        this.crearUsuario = crearUsuario;
        this.obtenerUsuario = obtenerUsuario;
        this.actualizarUsuario = actualizarUsuario;
        this.eliminarUsuario = eliminarUsuario;
    }

    @PostMapping("/")
    ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario nuevoUsuario){
        return new ResponseEntity<>(crearUsuario.guardar(nuevoUsuario), HttpStatus.CREATED);
    }

    @GetMapping("/")
    ResponseEntity<List<Usuario>> todosUsuarios(){
        return new ResponseEntity<>(obtenerUsuario.obtenerTodos(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<Usuario> obtenerUsuarioByid(@PathVariable Long id){
        return new ResponseEntity<>(obtenerUsuario.obtenerUsuario(id),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    ResponseEntity<Usuario> actualizarUsuario(@PathVariable long id,@RequestBody Usuario nuevoUsu){
        return new ResponseEntity<>(actualizarUsuario.actualizar(id,nuevoUsu),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    ResponseEntity eliminarUsuario(@PathVariable long id){
        eliminarUsuario.eliminar(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
