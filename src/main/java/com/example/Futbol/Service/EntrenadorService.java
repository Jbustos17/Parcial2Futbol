package com.example.Futbol.Service;

import com.example.Futbol.Model.Entrenador;
import java.util.List;

public interface EntrenadorService {
    List<Entrenador> listarEntrenadores();
    Entrenador buscarEntrenadorPorId(Integer id);
    Entrenador guardarEntrenador(Entrenador entrenador);
    void eliminarEntrenador(Integer id);
}

