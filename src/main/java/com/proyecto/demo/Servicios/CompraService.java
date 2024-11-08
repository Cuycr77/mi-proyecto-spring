package com.proyecto.demo.Servicios;

import com.proyecto.demo.Entidad.Compra;
import com.proyecto.demo.Repositorios.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    public List<Compra> getAllCompras() {
        return compraRepository.findAll();
    }

    public Optional<Compra> getCompraById(Integer id) {
        return compraRepository.findById(id);
    }

    public Compra saveCompra(Compra compra) {
        return compraRepository.save(compra);
    }

    public void deleteCompra(Integer id) {
        compraRepository.deleteById(id);
    }
}
