package com.PruebaTecnica.Springboot.serviceUsuarios.service;

import com.PruebaTecnica.Springboot.serviceUsuarios.entity.Usuario;
import com.PruebaTecnica.Springboot.serviceUsuarios.exeption.UsuarioNotFoundException;
import com.PruebaTecnica.Springboot.serviceUsuarios.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario guardar(Usuario nuevoUsuario) {
        return usuarioRepository.save(nuevoUsuario);
    }

    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario obtenerUsuario(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(
                        () -> new UsuarioNotFoundException(id)
                );
    }

    public Usuario actualizar(long id, Usuario nuevoUsu) {
        return usuarioRepository.findById(id)
                .map(usuario -> {
                    usuario.setNombre(nuevoUsu.getNombre());
                    usuario.setApellido(nuevoUsu.getApellido());
                    usuario.setFechaNacimiento(nuevoUsu.getFechaNacimiento());
                    usuario.setCargo(nuevoUsu.getCargo());
                    usuario.setTelefono(nuevoUsu.getTelefono());
                    return usuarioRepository.save(usuario);
                })
                .orElseGet(() -> {
                    nuevoUsu.setId(id);
                    return usuarioRepository.save(nuevoUsu);
                });
    }

    public void eliminarUsuario(long id) {
        usuarioRepository.delete(new Usuario(id));
    }


    //metodos de crud
}
