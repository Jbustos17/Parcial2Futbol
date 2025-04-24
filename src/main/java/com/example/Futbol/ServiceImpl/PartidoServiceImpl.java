package com.example.Futbol.ServiceImpl;

import com.example.Futbol.Model.Partido;
import com.example.Futbol.Repository.PartidoRepository;
import com.example.Futbol.Service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PartidoServiceImpl implements PartidoService {

    @Autowired
    private PartidoRepository partidoRepository;

    @Override
    public List<Partido> listarPartidos() {
        return partidoRepository.findAll();
    }

    @Override
    public Partido buscarPartidoPorId(Integer id) {
        return partidoRepository.findById(id).orElse(null);
    }

    @Override
    public Partido guardarPartido(Partido partido) {
        return partidoRepository.save(partido);
    }

    @Override
    public void eliminarPartido(Integer id) {
        partidoRepository.deleteById(id);
    }
}

