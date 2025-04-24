package com.example.Futbol.Controllers;


import com.example.Futbol.Model.Partido;
import com.example.Futbol.Service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/partidos")
public class PartidoController {

    @Autowired
    private PartidoService partidoService;

    @GetMapping
    public List<Partido> listarPartidos() {
        return partidoService.listarPartidos();
    }

    @GetMapping("/{id}")
    public Partido buscarPartido(@PathVariable Integer id) {
        return partidoService.buscarPartidoPorId(id);
    }

    @PostMapping
    public Partido guardarPartido(@RequestBody Partido partido) {
        return partidoService.guardarPartido(partido);
    }

    @DeleteMapping("/{id}")
    public void eliminarPartido(@PathVariable Integer id) {
        partidoService.eliminarPartido(id);
    }
}
