package com.example.Futbol.Service;

import com.example.Futbol.Model.Equipo;
import java.util.List;

public interface EquipoService {
    List<Equipo> listarEquipos();
    Equipo buscarEquipoPorId(Integer id);
    Equipo guardarEquipo(Equipo equipo);
    void eliminarEquipo(Integer id);
}
