package com.proyecto.demo.Repositorios;

import com.proyecto.demo.Entidad.DetalleCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleCompraRepository extends JpaRepository<DetalleCompra, Integer> {
    // Consultas personalizadas si son necesarias
}

