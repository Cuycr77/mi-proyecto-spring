package com.proyecto.demo.Repositorios;

import com.proyecto.demo.Entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Consultas personalizadas si son necesarias
}

