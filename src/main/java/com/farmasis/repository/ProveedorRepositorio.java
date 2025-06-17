package com.farmasis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmasis.model.Proveedor;

public interface ProveedorRepositorio extends JpaRepository<Proveedor, Long> {

    Proveedor findByNombre(String nombre);

}
