package com.proyecto.demo.Controladores;

import com.proyecto.demo.Entidad.Producto;
import com.proyecto.demo.Servicios.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.getAllProductos();
    }

    @GetMapping("/{codigo}")
    public Optional<Producto> getProductoById(@PathVariable Integer codigo) {
        return productoService.getProductoById(codigo);
    }

    @PostMapping("/insertar")
    public ResponseEntity<String> insertarProducto(
            @RequestParam("codigo") Integer codigo,
            @RequestParam("nombre") String nombre,
            @RequestParam("precio") Double precio,
            @RequestParam("cantidad") Integer cantidad,
            @RequestParam("descripcion") String descripcion,
            @RequestParam("file") MultipartFile file) {
        // Aquí procesas los datos y el archivo (file)
        return ResponseEntity.ok("Producto agregado correctamente");
    }

    @PostMapping
    public Producto saveProducto(@RequestBody Producto producto) {
        return productoService.saveProducto(producto);
    }

    @DeleteMapping("/{codigo}")
    public void deleteProducto(@PathVariable Integer codigo) {
        productoService.deleteProducto(codigo);
    }
}

