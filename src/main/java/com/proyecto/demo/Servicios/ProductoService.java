package com.proyecto.demo.Servicios;

import com.proyecto.demo.Entidad.Producto;
import com.proyecto.demo.Repositorios.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    public Optional<Producto> getProductoById(Integer codigo) {
        return productoRepository.findById(codigo);
    }

    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public void deleteProducto(Integer codigo) {
        productoRepository.deleteById(codigo);
    }
}

