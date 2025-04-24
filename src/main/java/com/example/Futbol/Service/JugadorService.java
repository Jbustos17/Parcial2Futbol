package com.example.Futbol.Service;

import com.example.Futbol.Model.Jugador;
import java.util.List;

public interface JugadorService {
    List<Jugador> listarJugadores();
    Jugador buscarJugadorPorId(Integer id);
    Jugador guardarJugador(Jugador jugador);
    void eliminarJugador(Integer id);
}
