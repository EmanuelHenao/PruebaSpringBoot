package com.PruebaTecnica.Springboot.serviceUsuarios.exeption;

public class UsuarioNotFoundException extends RuntimeException {
    public UsuarioNotFoundException(Long id) {
        super("No se pudo encontrar el usuario con el id:" + id);
    }
}
