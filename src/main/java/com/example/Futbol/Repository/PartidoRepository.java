package com.example.Futbol.Repository;

import com.example.Futbol.Model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PartidoRepository extends JpaRepository<Partido, Integer> {

    // 4. Obtener los resultados de todos los partidos indicando los nombres de los equipos
    @Query(value = "SELECT p.id_partido, p.fecha, el.nombre AS equipo_local, ev.nombre AS equipo_visita, " +
            "p.goles_local, p.goles_visita " +
            "FROM partido p " +
            "JOIN equipo el ON p.equipo_local = el.id_equipo " +
            "JOIN equipo ev ON p.equipo_visita = ev.id_equipo", nativeQuery = true)
    List<Object[]> obtenerResultadosDePartidos();
}
