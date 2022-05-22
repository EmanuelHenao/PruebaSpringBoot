package com.PruebaTecnica.Springboot.serviceUsuarios.casoUso;

import com.PruebaTecnica.Springboot.serviceUsuarios.service.UsuarioService;
import org.springframework.stereotype.Component;

@Component
public class EliminarUsuario {
    private UsuarioService usuarioService;

    public EliminarUsuario(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public void eliminar(long id) {
        usuarioService.eliminarUsuario(id);
    }
}
