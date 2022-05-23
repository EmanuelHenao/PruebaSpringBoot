package com.PruebaTecnica.Springboot.serviceUsuarios.repository;

import com.PruebaTecnica.Springboot.serviceUsuarios.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    List<Usuario> findByFechaNacimientoBetween(LocalDate inicio,LocalDate end);

}
