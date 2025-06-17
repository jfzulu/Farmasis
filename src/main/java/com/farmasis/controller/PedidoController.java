package com.farmasis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.farmasis.model.Pedido;
import com.farmasis.repository.PedidoRepositorio;
import com.farmasis.repository.ProveedorRepositorio;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Autowired
    private ProveedorRepositorio proveedorRepositorio;

    @GetMapping({ "", "/" })
    public String listarPedidos(Model model) {
        List<Pedido> pedidos = pedidoRepositorio.findAll();
        model.addAttribute("pedidos", pedidos);
        return "listar-pedidos";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoPedido(Model model) {
        model.addAttribute("pedido", new Pedido());
        model.addAttribute("proveedores", proveedorRepositorio.findAll());
        return "nuevo-pedido";
    }

    @PostMapping("/guardar")
    public String guardarPedido(@ModelAttribute Pedido pedido) {
        pedidoRepositorio.save(pedido);
        return "redirect:/pedidos";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarPedido(@PathVariable Long id, Model model) {
        Pedido pedido = pedidoRepositorio.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado"));
        model.addAttribute("pedido", pedido);
        return "nuevo-pedido";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarPedido(@PathVariable Long id) {
        if (!pedidoRepositorio.existsById(id)) {
            throw new IllegalArgumentException("El pedido con ID " + id + " no existe.");
        }
        pedidoRepositorio.deleteById(id);
        return "redirect:/pedidos";
    }

}
