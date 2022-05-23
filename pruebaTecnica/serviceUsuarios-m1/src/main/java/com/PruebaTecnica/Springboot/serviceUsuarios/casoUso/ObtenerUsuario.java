package com.PruebaTecnica.Springboot.serviceUsuarios.casoUso;

import com.PruebaTecnica.Springboot.serviceUsuarios.entity.Usuario;
import com.PruebaTecnica.Springboot.serviceUsuarios.service.UsuarioService;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class ObtenerUsuario {
    private UsuarioService usuarioService;

    public ObtenerUsuario(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public List<Usuario> obtenerTodos() {
        return usuarioService.obtenerTodos();
    }

    public Usuario obtenerUsuario(Long id) {
        return usuarioService.obtenerUsuario(id);
    }

    public List<Usuario> obtenerByFechaNacimientoBetween(LocalDate inicio, LocalDate fin) {
        return usuarioService.obtenerByFechaNacimientoBetween(inicio,fin);
    }
}
