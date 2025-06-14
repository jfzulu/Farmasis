package com.farmasis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmasis.model.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
    List<Producto> findByNombreContainingIgnoreCase(String nombre);

}
