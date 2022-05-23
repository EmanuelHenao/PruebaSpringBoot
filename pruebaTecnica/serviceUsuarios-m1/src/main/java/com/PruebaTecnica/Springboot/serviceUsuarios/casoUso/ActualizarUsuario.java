package com.PruebaTecnica.Springboot.serviceUsuarios.casoUso;

import com.PruebaTecnica.Springboot.serviceUsuarios.entity.Usuario;
import com.PruebaTecnica.Springboot.serviceUsuarios.service.UsuarioService;
import org.springframework.stereotype.Component;

@Component
public class ActualizarUsuario {
    private UsuarioService usuarioService;

    public ActualizarUsuario(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public Usuario actualizar(long id, Usuario nuevoUsu) {
        return usuarioService.actualizar(id,nuevoUsu);
    }
}
