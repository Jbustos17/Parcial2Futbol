package com.example.Futbol.Repository;

import com.example.Futbol.Model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Integer> {

    // 3. Obtener el número total de goles marcados por un equipo en todos sus partidos
    @Query(value = "SELECT SUM(p.goles_local) FROM partido p WHERE p.equipo_local = :idEquipo " +
            "UNION ALL " +
            "SELECT SUM(p.goles_visita) FROM partido p WHERE p.equipo_visita = :idEquipo", nativeQuery = true)
    List<Integer> getTotalGolesPorEquipo(@Param("idEquipo") Integer idEquipo);
}
