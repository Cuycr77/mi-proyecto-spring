package com.proyecto.demo.Controladores;

import com.proyecto.demo.Entidad.Usuario;
import com.proyecto.demo.Servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @GetMapping("/{documento}")
    public Optional<Usuario> getUsuarioById(@PathVariable Integer documento) {
        return usuarioService.getUsuarioById(documento);
    }

    @PostMapping
    public Usuario saveUsuario(@RequestBody Usuario usuario) {
        return usuarioService.saveUsuario(usuario);
    }

    @DeleteMapping("/{documento}")
    public void deleteUsuario(@PathVariable Integer documento) {
        usuarioService.deleteUsuario(documento);
    }
}
