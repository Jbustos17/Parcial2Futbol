package com.example.Futbol.ServiceImpl;


import com.example.Futbol.Model.EstadisticasJugador;
import com.example.Futbol.Repository.EstadisticasJugadorRepository;
import com.example.Futbol.Service.EstadisticasJugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstadisticasJugadorServiceImpl implements EstadisticasJugadorService {

    @Autowired
    private EstadisticasJugadorRepository estadisticasJugadorRepository;

    @Override
    public List<EstadisticasJugador> listarEstadisticas() {
        return estadisticasJugadorRepository.findAll();
    }

    @Override
    public EstadisticasJugador buscarEstadisticaPorId(Integer id) {
        return estadisticasJugadorRepository.findById(id).orElse(null);
    }

    @Override
    public EstadisticasJugador guardarEstadistica(EstadisticasJugador estadistica) {
        return estadisticasJugadorRepository.save(estadistica);
    }

    @Override
    public void eliminarEstadistica(Integer id) {
        estadisticasJugadorRepository.deleteById(id);
    }
}
