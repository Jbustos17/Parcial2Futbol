package com.example.Futbol.Service;

import com.example.Futbol.Model.Partido;
import java.util.List;

public interface PartidoService {
    List<Partido> listarPartidos();
    Partido buscarPartidoPorId(Integer id);
    Partido guardarPartido(Partido partido);
    void eliminarPartido(Integer id);
}
