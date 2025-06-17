package com.farmasis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmasis.model.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {

    List<Pedido> findByProveedorId(Long proveedorId);

}
