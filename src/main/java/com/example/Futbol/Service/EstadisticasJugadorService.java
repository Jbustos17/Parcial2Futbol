package com.example.Futbol.Service;

import com.example.Futbol.Model.EstadisticasJugador;
import java.util.List;

public interface EstadisticasJugadorService {
    List<EstadisticasJugador> listarEstadisticas();
    EstadisticasJugador buscarEstadisticaPorId(Integer id);
    EstadisticasJugador guardarEstadistica(EstadisticasJugador estadistica);
    void eliminarEstadistica(Integer id);
}
