package com.proyecto.demo.Servicios;

import com.proyecto.demo.Entidad.Cliente;
import com.proyecto.demo.Repositorios.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getClienteById(Integer documento) {
        return clienteRepository.findById(documento);
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteCliente(Integer documento) {
        clienteRepository.deleteById(documento);
    }
}

