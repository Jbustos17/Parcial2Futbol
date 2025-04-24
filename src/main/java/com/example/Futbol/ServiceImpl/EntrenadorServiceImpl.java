package com.example.Futbol.ServiceImpl;

import com.example.Futbol.Model.Entrenador;
import com.example.Futbol.Repository.EntrenadorRepository;
import com.example.Futbol.Service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EntrenadorServiceImpl implements EntrenadorService {

    @Autowired
    private EntrenadorRepository entrenadorRepository;

    @Override
    public List<Entrenador> listarEntrenadores() {
        return entrenadorRepository.findAll();
    }

    @Override
    public Entrenador buscarEntrenadorPorId(Integer id) {
        return entrenadorRepository.findById(id).orElse(null);
    }

    @Override
    public Entrenador guardarEntrenador(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    @Override
    public void eliminarEntrenador(Integer id) {
        entrenadorRepository.deleteById(id);
    }
}
