package com.proyecto.demo.Controladores;

import com.proyecto.demo.Entidad.Cliente;
import com.proyecto.demo.Servicios.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/registrarCliente")
    public ResponseEntity<?> registrarCliente(@RequestBody Cliente cliente) {
        try {
            // Lógica para guardar el cliente en la base de datos
            clienteService.saveCliente(cliente);
            return ResponseEntity.status(HttpStatus.CREATED).body("Cliente registrado correctamente");
        } catch (Exception e) {
            e.printStackTrace();  // Captura el error en los logs
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al registrar cliente");
        }
    }

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{documento}")
    public Optional<Cliente> getClienteById(@PathVariable Integer documento) {
        return clienteService.getClienteById(documento);
    }

    @PostMapping
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }

    @DeleteMapping("/{documento}")
    public void deleteCliente(@PathVariable Integer documento) {
        clienteService.deleteCliente(documento);
    }
}

