package com.farmasis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmasis.model.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNombreContainingIgnoreCase(String nombre);

    Cliente findByDocumento(String documento);

}
