package com.PruebaTecnica.Springboot.serviceUsuarios.casoUso;

import com.PruebaTecnica.Springboot.serviceUsuarios.entity.Usuario;
import com.PruebaTecnica.Springboot.serviceUsuarios.service.UsuarioService;
import org.springframework.stereotype.Component;

@Component
public class CrearUsuario {
    private UsuarioService usuarioService;

    public CrearUsuario(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public Usuario guardar(Usuario nuevoUsuario) {
        return usuarioService.guardar(nuevoUsuario);
    }
}
