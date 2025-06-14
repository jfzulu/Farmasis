package com.farmasis.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String numeroReferencia;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaVencimiento;

    private String numeroLote;

    private Integer cantidad;

    private Integer precioCompra;

    private Integer precioVenta;

    private Double margenGanancia;

    @Enumerated(EnumType.STRING)
    private CategoriaProducto Categoria;

    @Column(length = 1000)
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(String numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Integer precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Integer precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(Double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    public CategoriaProducto getCategoria() {
        return Categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        Categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto(Long id, String nombre, String numeroReferencia, LocalDate fechaVencimiento, String numeroLote,
            Integer cantidad, Integer precioCompra, Integer precioVenta, Double margenGanancia,
            CategoriaProducto categoria, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.numeroReferencia = numeroReferencia;
        this.fechaVencimiento = fechaVencimiento;
        this.numeroLote = numeroLote;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.margenGanancia = margenGanancia;
        Categoria = categoria;
        this.descripcion = descripcion;
    }

    public Producto() {
    }

}
