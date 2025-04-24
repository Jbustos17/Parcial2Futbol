package com.example.Futbol.ServiceImpl;

import com.example.Futbol.Model.Jugador;
import com.example.Futbol.Repository.JugadorRepository;
import com.example.Futbol.Service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JugadorServiceImpl implements JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Override
    public List<Jugador> listarJugadores() {
        return jugadorRepository.findAll();
    }

    @Override
    public Jugador buscarJugadorPorId(Integer id) {
        return jugadorRepository.findById(id).orElse(null);
    }

    @Override
    public Jugador guardarJugador(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @Override
    public void eliminarJugador(Integer id) {
        jugadorRepository.deleteById(id);
    }
}
