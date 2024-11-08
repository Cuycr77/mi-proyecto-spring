package com.proyecto.demo.Entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")

public class Usuario {

    @Id
    private Integer documento;

    @OneToOne
    @JoinColumn(name = "documento", referencedColumnName = "documento", insertable = false, updatable = false)
    private Cliente cliente;

    @Column(length = 50, nullable = false)
    private String nombreUsuario;

    @Column(length = 100, nullable = false)
    private String password;

    // Getters y Setters
    public Integer getDocumento() { return documento; }
    public void setDocumento(Integer documento) { this.documento = documento; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "Usuario [documento=" + documento + ", nombreUsuario=" + nombreUsuario + ", password=" + password + "]";
    }
}
