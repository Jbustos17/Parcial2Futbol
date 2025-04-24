package com.example.Futbol.Controllers;


import com.example.Futbol.Model.EstadisticasJugador;
import com.example.Futbol.Service.EstadisticasJugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/estadisticas")
public class EstadisticasJugadorController {

    @Autowired
    private EstadisticasJugadorService estadisticasJugadorService;

    @GetMapping
    public List<EstadisticasJugador> listarEstadisticas() {
        return estadisticasJugadorService.listarEstadisticas();
    }

    @GetMapping("/{id}")
    public EstadisticasJugador buscarEstadistica(@PathVariable Integer id) {
        return estadisticasJugadorService.buscarEstadisticaPorId(id);
    }

    @PostMapping
    public EstadisticasJugador guardarEstadistica(@RequestBody EstadisticasJugador estadistica) {
        return estadisticasJugadorService.guardarEstadistica(estadistica);
    }

    @DeleteMapping("/{id}")
    public void eliminarEstadistica(@PathVariable Integer id) {
        estadisticasJugadorService.eliminarEstadistica(id);
    }
}
