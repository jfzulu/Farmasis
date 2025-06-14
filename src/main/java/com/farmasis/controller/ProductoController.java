package com.farmasis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.farmasis.model.Producto;
import com.farmasis.repository.ProductoRepositorio;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @GetMapping({ "", "/" })
    public String listarProductos(Model model) {
        model.addAttribute("productos", productoRepositorio.findAll());
        return "listar-productos";
    }

    @GetMapping("/buscar")
    @ResponseBody
    public List<Producto> buscarProductos(@RequestParam("query") String query) {
        return productoRepositorio.findByNombreContainingIgnoreCase(query);
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioProducto(Model model) {
        model.addAttribute("producto", new Producto());
        return "nuevo-producto";
    }

    @PostMapping("/guardar")
    public String guardarProducto(@ModelAttribute Producto producto) {
        productoRepositorio.save(producto);

        return "redirect:/productos";
    }

}
