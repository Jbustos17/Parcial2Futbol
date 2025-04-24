package com.example.Futbol.Controllers;

import com.example.Futbol.Model.Jugador;
import com.example.Futbol.Service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    @GetMapping
    public List<Jugador> listarJugadores() {
        return jugadorService.listarJugadores();
    }

    @GetMapping("/{id}")
    public Jugador buscarJugador(@PathVariable Integer id) {
        return jugadorService.buscarJugadorPorId(id);
    }

    @PostMapping
    public Jugador guardarJugador(@RequestBody Jugador jugador) {
        return jugadorService.guardarJugador(jugador);
    }

    @DeleteMapping("/{id}")
    public void eliminarJugador(@PathVariable Integer id) {
        jugadorService.eliminarJugador(id);
    }
}
