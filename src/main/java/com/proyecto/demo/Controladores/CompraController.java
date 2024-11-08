package com.proyecto.demo.Controladores;

import com.proyecto.demo.Entidad.Compra;
import com.proyecto.demo.Servicios.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping
    public List<Compra> getAllCompras() {
        return compraService.getAllCompras();
    }

    @GetMapping("/{id}")
    public Optional<Compra> getCompraById(@PathVariable Integer id) {
        return compraService.getCompraById(id);
    }

    @PostMapping
    public Compra saveCompra(@RequestBody Compra compra) {
        return compraService.saveCompra(compra);
    }

    @DeleteMapping("/{id}")
    public void deleteCompra(@PathVariable Integer id) {
        compraService.deleteCompra(id);
    }
}

