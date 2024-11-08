package com.proyecto.demo.Controladores;

import com.proyecto.demo.Entidad.DetalleCompra;
import com.proyecto.demo.Servicios.DetalleCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/detalleCompras")
public class DetalleCompraController {

    @Autowired
    private DetalleCompraService detalleCompraService;

    @GetMapping
    public List<DetalleCompra> getAllDetalles() {
        return detalleCompraService.getAllDetalles();
    }

    @GetMapping("/{id}")
    public Optional<DetalleCompra> getDetalleById(@PathVariable Integer id) {
        return detalleCompraService.getDetalleById(id);
    }

    @PostMapping
    public DetalleCompra saveDetalle(@RequestBody DetalleCompra detalleCompra) {
        return detalleCompraService.saveDetalle(detalleCompra);
    }

    @DeleteMapping("/{id}")
    public void deleteDetalle(@PathVariable Integer id) {
        detalleCompraService.deleteDetalle(id);
    }
}

