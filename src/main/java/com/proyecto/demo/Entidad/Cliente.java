package com.proyecto.demo.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private Integer documento;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Column(length = 50, nullable = false)
    private String apellido;

    @Column(length = 50)
    private String correo;

    @Column
    private Integer celular;

    @Column(length = 50)
    private String nombreTienda;

    // Getters y Setters
    public Integer getDocumento() { return documento; }
    public void setDocumento(Integer documento) { this.documento = documento; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public Integer getCelular() { return celular; }
    public void setCelular(Integer celular) { this.celular = celular; }

    public String getNombreTienda() { return nombreTienda; }
    public void setNombreTienda(String nombreTienda) { this.nombreTienda = nombreTienda; }

    @Override
    public String toString() {
        return "Cliente [documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido +
                ", correo=" + correo + ", celular=" + celular + ", nombreTienda=" + nombreTienda + "]";
    }
}

