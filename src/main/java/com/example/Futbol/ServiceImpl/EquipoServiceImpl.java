package com.example.Futbol.ServiceImpl;


import com.example.Futbol.Model.Equipo;
import com.example.Futbol.Repository.EquipoRepository;
import com.example.Futbol.Service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EquipoServiceImpl implements EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    @Override
    public List<Equipo> listarEquipos() {
        return equipoRepository.findAll();
    }

    @Override
    public Equipo buscarEquipoPorId(Integer id) {
        return equipoRepository.findById(id).orElse(null);
    }

    @Override
    public Equipo guardarEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @Override
    public void eliminarEquipo(Integer id) {
        equipoRepository.deleteById(id);
    }
}
