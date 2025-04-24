package com.example.Futbol.Controllers;

import com.example.Futbol.Model.Entrenador;
import com.example.Futbol.Service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/entrenadores")
public class EntrenadorController {

    @Autowired
    private EntrenadorService entrenadorService;

    @GetMapping
    public List<Entrenador> listarEntrenadores() {
        return entrenadorService.listarEntrenadores();
    }

    @GetMapping("/{id}")
    public Entrenador buscarEntrenador(@PathVariable Integer id) {
        return entrenadorService.buscarEntrenadorPorId(id);
    }

    @PostMapping
    public Entrenador guardarEntrenador(@RequestBody Entrenador entrenador) {
        return entrenadorService.guardarEntrenador(entrenador);
    }

    @DeleteMapping("/{id}")
    public void eliminarEntrenador(@PathVariable Integer id) {
        entrenadorService.eliminarEntrenador(id);
    }
}
