package com.proyecto.demo.Entidad;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "compras")

public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDateTime fechaCompra;

    @Column(nullable = false)
    private Integer clienteDocumento;

    @Column(nullable = false)
    private Integer total;

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public LocalDateTime getFechaCompra() { return fechaCompra; }
    public void setFechaCompra(LocalDateTime fechaCompra) { this.fechaCompra = fechaCompra; }

    public Integer getClienteDocumento() { return clienteDocumento; }
    public void setClienteDocumento(Integer clienteDocumento) { this.clienteDocumento = clienteDocumento; }

    public Integer getTotal() { return total; }
    public void setTotal(Integer total) { this.total = total; }

    @Override
    public String toString() {
        return "Compra [id=" + id + ", fechaCompra=" + fechaCompra + ", clienteDocumento=" + clienteDocumento +
                ", total=" + total + "]";
    }
}
