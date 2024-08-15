package com.example.demo.web;

import com.example.demo.domain.Tarea;
import com.example.demo.domain.TareaControlador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class PaginaControlador {

    private TareaControlador tareaControlador;

    public PaginaControlador(TareaControlador tareaControlador) {
        this.tareaControlador = tareaControlador;
    }

    @GetMapping
    public String inicio(Model model) {
        List<Tarea> tareas = this.tareaControlador.getTareas();
        if (tareas != null) {
            model.addAttribute("tareas", tareas  );
        }
        return "inicio";
    }
}
