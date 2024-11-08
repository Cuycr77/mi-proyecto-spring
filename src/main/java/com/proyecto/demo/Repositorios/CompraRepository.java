package com.proyecto.demo.Repositorios;

import com.proyecto.demo.Entidad.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Integer> {
    // Consultas personalizadas si son necesarias
}

