package com.farmasis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.farmasis.model.Nota;
import com.farmasis.repository.NotaRepositorio;

import jakarta.validation.Valid;

@Controller
public class NotaController {

    @Autowired
    private NotaRepositorio notaRepositorio;

    @GetMapping("/notas/nueva")
    public String mostrarFormularioNuevaNota(Model model) {
        model.addAttribute("nota", new Nota());
        return "nueva-nota";
    }

    @PostMapping("notas/guardar")
    public String guardarNota(@Valid @ModelAttribute("nota") Nota nota, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "nueva-nota";
        }

        notaRepositorio.save(nota);
        return "redirect:/";
    }

    @GetMapping("/notas/editar/{id}")
    public String editarNota(@PathVariable Long id, Model model) {
        Nota nota = notaRepositorio.findById(id).orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        model.addAttribute("nota", nota);
        return "nueva-nota";
    }

    @PostMapping("/notas/eliminar/{id}")
    public String eliminarNota(@PathVariable Long id) {
        notaRepositorio.deleteById(id);

        return "redirect:/";
    }

}
