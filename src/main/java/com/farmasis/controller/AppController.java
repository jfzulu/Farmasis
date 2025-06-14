package com.farmasis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.farmasis.model.Nota;
import com.farmasis.repository.NotaRepositorio;

@Controller
public class AppController {

    @Autowired
    private NotaRepositorio notaRepositorio;

    @GetMapping({ "", "/" })
    public String verPaginaInicio(Model model) {
        List<Nota> notas = notaRepositorio.findAll();
        model.addAttribute("notas", notas);
        return "index";
    }

}
