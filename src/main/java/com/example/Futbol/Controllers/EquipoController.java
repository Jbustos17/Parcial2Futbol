package com.example.Futbol.Controllers;


import com.example.Futbol.Model.Equipo;
import com.example.Futbol.Service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/equipos")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @GetMapping
    public List<Equipo> listarEquipos() {
        return equipoService.listarEquipos();
    }

    @GetMapping("/{id}")
    public Equipo buscarEquipo(@PathVariable Integer id) {
        return equipoService.buscarEquipoPorId(id);
    }

    @PostMapping
    public Equipo guardarEquipo(@RequestBody Equipo equipo) {
        return equipoService.guardarEquipo(equipo);
    }

    @DeleteMapping("/{id}")
    public void eliminarEquipo(@PathVariable Integer id) {
        equipoService.eliminarEquipo(id);
    }
}
