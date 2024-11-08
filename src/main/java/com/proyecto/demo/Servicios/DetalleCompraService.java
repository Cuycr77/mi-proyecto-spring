package com.proyecto.demo.Servicios;

import com.proyecto.demo.Entidad.DetalleCompra;
import com.proyecto.demo.Repositorios.DetalleCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleCompraService {

    @Autowired
    private DetalleCompraRepository detalleCompraRepository;

    public List<DetalleCompra> getAllDetalles() {
        return detalleCompraRepository.findAll();
    }

    public Optional<DetalleCompra> getDetalleById(Integer id) {
        return detalleCompraRepository.findById(id);
    }

    public DetalleCompra saveDetalle(DetalleCompra detalleCompra) {
        return detalleCompraRepository.save(detalleCompra);
    }

    public void deleteDetalle(Integer id) {
        detalleCompraRepository.deleteById(id);
    }
}

