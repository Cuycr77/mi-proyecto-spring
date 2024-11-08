package com.proyecto.demo.Repositorios;

import com.proyecto.demo.Entidad.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    // Puedes agregar consultas personalizadas aquí si lo necesitas
}

